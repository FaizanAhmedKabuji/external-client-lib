# Tasks: Basic Setup - External Client Library

## Status Legend
- [ ] Not started
- [x] Complete (YYYY-MM-DD)
- [x] BLOCKED: reason

## Implementation Tasks
- [ ] Add spring-boot-starter-webflux dependency to build.gradle
- [ ] Configure Gradle publishing configuration in build.gradle
- [ ] Remove ExternalClientLibApplication.java (convert from Spring Boot app to library)
- [ ] Create core WebClient.java class with fluent API foundation
- [ ] Create GetRequestBuilder.java for GET request fluent API
- [ ] Create PostRequestBuilder.java for POST request fluent API
- [ ] Create PutRequestBuilder.java for PUT request fluent API
- [ ] Create DeleteRequestBuilder.java for DELETE request fluent API
- [ ] Implement request execution logic with generic response handling
- [ ] Create RequestBuilder interface for common request builder methods

## Validation Tasks
- [ ] Create WebClientTest.java to test fluent API functionality
- [ ] Test GET requests with generic response types
- [ ] Test POST requests with body and generic responses
- [ ] Test PUT and DELETE operations
- [ ] Verify library builds without main method
- [ ] Test Gradle publishing configuration

## Documentation Tasks
- [ ] Update build.gradle comments for library usage
- [ ] Add JavaDoc to WebClient public API methods