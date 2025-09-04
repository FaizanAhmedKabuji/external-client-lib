# Publishing Guide

## Quick Setup

1. **Get your GitHub Personal Access Token**
   - Go to: https://github.com/settings/tokens
   - Click "Generate new token (classic)"
   - Select scopes: `repo`, `write:packages`, `read:packages`
   - Copy the token (starts with `ghp_` or `github_pat_`)

2. **Choose your preferred method:**

### Method 1: Using the publish script (Recommended)
```bash
./publish.sh YOUR_GITHUB_TOKEN_HERE
```

### Method 2: Using environment variables
```bash
export USERNAME="FaizanAhmedKabuji"
export TOKEN="YOUR_GITHUB_TOKEN_HERE"
./gradlew publish
```

### Method 3: Using gradle.properties (Less secure)
Edit `gradle.properties` and replace `your_github_token_here` with your actual token:
```properties
gpr.user=FaizanAhmedKabuji
gpr.key=YOUR_ACTUAL_GITHUB_TOKEN
```
Then run:
```bash
./gradlew publish
```

## Verification

After publishing, check:
- GitHub Packages: https://github.com/FaizanAhmedKabuji/external-client-lib/packages
- Repository: https://github.com/FaizanAhmedKabuji/external-client-lib

## Using the Library

Add to your project's `build.gradle`:

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
