package com.alifa.externalclient;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
import org.springframework.web.reactive.function.BodyInserters;

import java.util.Map;
import java.util.HashMap;

/**
 * Builder for PUT HTTP requests with fluent API.
 */
public class PutRequestBuilder implements RequestBuilder<PutRequestBuilder> {
    
    private final WebClient webClient;
    private String url;
    private Map<String, String> headers = new HashMap<>();
    private Object requestBody;
    
    /**
     * Creates a new PutRequestBuilder with the provided WebClient.
     * 
     * @param webClient the reactive WebClient to use for the request
     */
    public PutRequestBuilder(WebClient webClient) {
        this.webClient = webClient;
    }
    
    @Override
    public PutRequestBuilder url(String url) {
        this.url = url;
        return this;
    }
    
    @Override
    public PutRequestBuilder header(String name, String value) {
        this.headers.put(name, value);
        return this;
    }
    
    @Override
    public PutRequestBuilder headers(Map<String, String> headers) {
        this.headers.putAll(headers);
        return this;
    }
    
    /**
     * Set the request body.
     * 
     * @param body the request body object
     * @return the request builder for method chaining
     */
    public PutRequestBuilder body(Object body) {
        this.requestBody = body;
        return this;
    }
    
    /**
     * Set the request body as JSON string.
     * 
     * @param jsonBody the JSON string body
     * @return the request builder for method chaining
     */
    public PutRequestBuilder jsonBody(String jsonBody) {
        this.headers.put("Content-Type", "application/json");
        this.requestBody = jsonBody;
        return this;
    }
    
    @Override
    public <R> R execute(Class<R> responseType) {
        RequestBodySpec requestSpec = webClient.put().uri(url);
        
        // Add headers
        if (!headers.isEmpty()) {
            requestSpec = requestSpec.headers(httpHeaders -> {
                headers.forEach(httpHeaders::add);
            });
        }
        
        // Add body if present
        if (requestBody != null) {
            return requestSpec.body(BodyInserters.fromValue(requestBody))
                    .retrieve()
                    .bodyToMono(responseType)
                    .block();
        } else {
            return requestSpec
                    .retrieve()
                    .bodyToMono(responseType)
                    .block();
        }
    }
    
    @Override
    public String execute() {
        RequestBodySpec requestSpec = webClient.put().uri(url);
        
        // Add headers
        if (!headers.isEmpty()) {
            requestSpec = requestSpec.headers(httpHeaders -> {
                headers.forEach(httpHeaders::add);
            });
        }
        
        // Add body if present
        if (requestBody != null) {
            return requestSpec.body(BodyInserters.fromValue(requestBody))
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        } else {
            return requestSpec
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        }
    }
}