#!/bin/bash

echo "🚀 Publishing External Client Library to GitHub Packages"
echo "================================================="

# Check if TOKEN is provided as argument or environment variable
if [ -z "$1" ] && [ -z "$TOKEN" ]; then
    echo "❌ ERROR: GitHub Personal Access Token is required!"
    echo ""
    echo "Usage options:"
    echo "  1. ./publish.sh YOUR_GITHUB_TOKEN"
    echo "  2. export TOKEN=YOUR_GITHUB_TOKEN && ./publish.sh"
    echo "  3. Update gradle.properties with your token"
    echo ""
    echo "To get a token: https://github.com/settings/tokens"
    echo "Required scopes: repo, write:packages, read:packages"
    exit 1
fi

# Use token from argument if provided, otherwise use environment
if [ -n "$1" ]; then
    export TOKEN="$1"
fi

# Set GitHub username
export USERNAME="FaizanAhmedKabuji"

echo "👤 Username: $USERNAME"
echo "🔑 Token: ${TOKEN:0:8}... (hidden)"
echo ""

# Clean, build and publish
echo "🧹 Cleaning project..."
./gradlew clean

echo "🔨 Building project..."
./gradlew build

if [ $? -eq 0 ]; then
    echo "📦 Publishing to GitHub Packages..."
    ./gradlew publish
    
    if [ $? -eq 0 ]; then
        echo ""
        echo "✅ SUCCESS! Library published to GitHub Packages!"
        echo "🌐 Repository: https://github.com/FaizanAhmedKabuji/external-client-lib/packages"
        echo ""
        echo "📋 To use in other projects:"
        echo "   Group ID: com.alifa"
        echo "   Artifact ID: external-client-lib"
        echo "   Version: 0.0.1-SNAPSHOT"
    else
        echo "❌ Publishing failed! Check the error above."
        exit 1
    fi
else
    echo "❌ Build failed! Fix compilation errors first."
    exit 1
fi
