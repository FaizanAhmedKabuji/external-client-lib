package com.alifa.externalclient;

import org.springframework.web.reactive.function.client.WebClient.Builder;

/**
 * Generic REST client library providing fluent API for external service calls.
 * 
 * Usage examples:
 * - webClient.get().url("https://api.example.com/users").execute(User.class)
 * - webClient.post().url("https://api.example.com/users").body(user).execute(User.class)
 */
public class WebClient {
    
    private final org.springframework.web.reactive.function.client.WebClient reactiveWebClient;
    
    /**
     * Creates a new WebClient instance with default configuration.
     */
    public WebClient() {
        this.reactiveWebClient = org.springframework.web.reactive.function.client.WebClient.create();
    }
    
    /**
     * Creates a new WebClient instance with custom WebClient builder.
     * 
     * @param webClientBuilder custom WebClient builder for configuration
     */
    public WebClient(Builder webClientBuilder) {
        this.reactiveWebClient = webClientBuilder.build();
    }
    
    /**
     * Creates a new WebClient instance with existing reactive WebClient.
     * 
     * @param reactiveWebClient existing reactive WebClient instance
     */
    public WebClient(org.springframework.web.reactive.function.client.WebClient reactiveWebClient) {
        this.reactiveWebClient = reactiveWebClient;
    }
    
    /**
     * Start building a GET request.
     * 
     * @return GetRequestBuilder for fluent API
     */
    public GetRequestBuilder get() {
        return new GetRequestBuilder(reactiveWebClient);
    }
    
    /**
     * Start building a POST request.
     * 
     * @return PostRequestBuilder for fluent API
     */
    public PostRequestBuilder post() {
        return new PostRequestBuilder(reactiveWebClient);
    }
    
    /**
     * Start building a PUT request.
     * 
     * @return PutRequestBuilder for fluent API
     */
    public PutRequestBuilder put() {
        return new PutRequestBuilder(reactiveWebClient);
    }
    
    /**
     * Start building a DELETE request.
     * 
     * @return DeleteRequestBuilder for fluent API
     */
    public DeleteRequestBuilder delete() {
        return new DeleteRequestBuilder(reactiveWebClient);
    }
}