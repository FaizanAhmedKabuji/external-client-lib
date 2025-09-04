package com.alifa.externalclient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for WebClient fluent API functionality.
 */
class WebClientTest {
    
    private WebClient webClient;
    
    @BeforeEach
    void setUp() {
        webClient = new WebClient();
    }
    
    @Test
    void testWebClientCreation() {
        assertNotNull(webClient);
    }
    
    @Test
    void testWebClientCreationWithBuilder() {
        Builder builder = org.springframework.web.reactive.function.client.WebClient.builder();
        WebClient customWebClient = new WebClient(builder);
        assertNotNull(customWebClient);
    }
    
    @Test
    void testWebClientCreationWithExistingWebClient() {
        org.springframework.web.reactive.function.client.WebClient reactiveWebClient = 
            org.springframework.web.reactive.function.client.WebClient.create();
        WebClient customWebClient = new WebClient(reactiveWebClient);
        assertNotNull(customWebClient);
    }
    
    @Test
    void testGetRequestBuilderCreation() {
        GetRequestBuilder getBuilder = webClient.get();
        assertNotNull(getBuilder);
        assertInstanceOf(GetRequestBuilder.class, getBuilder);
    }
    
    @Test
    void testPostRequestBuilderCreation() {
        PostRequestBuilder postBuilder = webClient.post();
        assertNotNull(postBuilder);
        assertInstanceOf(PostRequestBuilder.class, postBuilder);
    }
    
    @Test
    void testPutRequestBuilderCreation() {
        PutRequestBuilder putBuilder = webClient.put();
        assertNotNull(putBuilder);
        assertInstanceOf(PutRequestBuilder.class, putBuilder);
    }
    
    @Test
    void testDeleteRequestBuilderCreation() {
        DeleteRequestBuilder deleteBuilder = webClient.delete();
        assertNotNull(deleteBuilder);
        assertInstanceOf(DeleteRequestBuilder.class, deleteBuilder);
    }
    
    @Test
    void testFluentAPIMethodChaining() {
        // Test that fluent API methods return correct types for chaining
        GetRequestBuilder getBuilder = webClient.get();
        GetRequestBuilder chainedBuilder = getBuilder.url("https://api.example.com").header("Accept", "application/json");
        assertNotNull(chainedBuilder);
        assertSame(GetRequestBuilder.class, chainedBuilder.getClass());
    }
    
    @Test
    void testPostRequestWithBody() {
        PostRequestBuilder postBuilder = webClient.post();
        PostRequestBuilder chainedBuilder = postBuilder
                .url("https://api.example.com/users")
                .header("Content-Type", "application/json")
                .body("{\"name\":\"test\"}");
        assertNotNull(chainedBuilder);
        assertSame(PostRequestBuilder.class, chainedBuilder.getClass());
    }
    
    @Test
    void testPutRequestWithJsonBody() {
        PutRequestBuilder putBuilder = webClient.put();
        PutRequestBuilder chainedBuilder = putBuilder
                .url("https://api.example.com/users/1")
                .jsonBody("{\"name\":\"updated\"}");
        assertNotNull(chainedBuilder);
        assertSame(PutRequestBuilder.class, chainedBuilder.getClass());
    }
}