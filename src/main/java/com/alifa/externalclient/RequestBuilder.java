package com.alifa.externalclient;

import java.util.Map;

/**
 * Common interface for all HTTP request builders providing fluent API methods.
 * 
 * @param <T> the type of the concrete request builder for method chaining
 */
public interface RequestBuilder<T extends RequestBuilder<T>> {
    
    /**
     * Set the target URL for the request.
     * 
     * @param url the target URL
     * @return the request builder for method chaining
     */
    T url(String url);
    
    /**
     * Add a header to the request.
     * 
     * @param name header name
     * @param value header value
     * @return the request builder for method chaining
     */
    T header(String name, String value);
    
    /**
     * Add multiple headers to the request.
     * 
     * @param headers map of header names to values
     * @return the request builder for method chaining
     */
    T headers(Map<String, String> headers);
    
    /**
     * Execute the request and return response as specified type.
     * 
     * @param <R> the response type
     * @param responseType the class of the expected response type
     * @return the response deserialized to the specified type
     */
    <R> R execute(Class<R> responseType);
    
    /**
     * Execute the request and return response as String.
     * 
     * @return the response as String
     */
    String execute();
}