package com.alifa.externalclient;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import java.util.Map;
import java.util.HashMap;

/**
 * Builder for GET HTTP requests with fluent API.
 */
public class GetRequestBuilder implements RequestBuilder<GetRequestBuilder> {
    
    private final WebClient webClient;
    private String url;
    private Map<String, String> headers = new HashMap<>();
    
    /**
     * Creates a new GetRequestBuilder with the provided WebClient.
     * 
     * @param webClient the reactive WebClient to use for the request
     */
    public GetRequestBuilder(WebClient webClient) {
        this.webClient = webClient;
    }
    
    @Override
    public GetRequestBuilder url(String url) {
        this.url = url;
        return this;
    }
    
    @Override
    public GetRequestBuilder header(String name, String value) {
        this.headers.put(name, value);
        return this;
    }
    
    @Override
    public GetRequestBuilder headers(Map<String, String> headers) {
        this.headers.putAll(headers);
        return this;
    }
    
    @Override
    public <R> R execute(Class<R> responseType) {
        RequestHeadersSpec<?> requestSpec = webClient.get().uri(url);
        
        // Add headers
        requestSpec = requestSpec.headers(httpHeaders -> {
            headers.forEach(httpHeaders::add);
        });
        
        return requestSpec
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }
    
    @Override
    public String execute() {
        RequestHeadersSpec<?> requestSpec = webClient.get().uri(url);
        
        // Add headers
        requestSpec = requestSpec.headers(httpHeaders -> {
            headers.forEach(httpHeaders::add);
        });
        
        return requestSpec
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}