# External Client Library

A Java library for making external HTTP requests with Spring WebFlux.

## Features

- Built with Spring Boot 3.5.5 and Java 21
- Uses Spring WebFlux for reactive HTTP clients
- Supports GET, POST, PUT, and DELETE operations
- Request builder pattern for easy API calls

## Installation

### GitHub Packages (Maven)

Add to your `pom.xml`:

```xml
<repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/FaizanAhmedKabuji/external-client-lib</url>
</repository>

<dependency>
    <groupId>com.alifa</groupId>
    <artifactId>external-client-lib</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### GitHub Packages (Gradle)

Add to your `build.gradle`:

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/FaizanAhmedKabuji/external-client-lib")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
        }
    }
}

dependencies {
    implementation 'com.alifa:external-client-lib:0.0.1-SNAPSHOT'
}
```

## Usage

```java
import com.alifa.externalclient.WebClient;

// Create a WebClient instance
WebClient client = new WebClient("https://api.example.com");

// Make GET request
String response = client.get()
    .path("/users")
    .execute();

// Make POST request
String response = client.post()
    .path("/users")
    .body(userObject)
    .execute();
```

## Building

```bash
./gradlew build
```

## Publishing

To publish to GitHub Packages:

```bash
./gradlew publish
```

## License

This project is licensed under the terms specified by Alifa.
