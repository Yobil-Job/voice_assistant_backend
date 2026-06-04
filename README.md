# Voice Assistant Backend

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.14-6DB33F?style=flat-square&logo=spring-boot)
![OpenAI](https://img.shields.io/badge/Spring%20AI-OpenAI-00ADEF?style=flat-square)

Compact, production-ready Spring Boot backend that integrates Spring AI's OpenAI model support to power conversational voice assistants and AI-driven features.

Why this repo
- Small, focused backend built with modern Java and Spring Boot.
- Uses Spring AI (OpenAI model starter) to access LLMs with familiar Spring abstractions.
- Designed to be extended with speech-to-text (STT) and text-to-speech (TTS) integrations for a full voice assistant.

Quick highlights
- Java 21
- Spring Boot 3.5.14
- spring-ai-starter-model-openai
- Maven build

Quick start
1. Clone and build
```bash
git clone https://github.com/Yobil-Job/voice_assistant_backend.git
cd voice_assistant_backend
mvn clean package
```

2. Run
```bash
# dev
mvn spring-boot:run
# or run the jar
java -jar target/voice_assistant-0.0.1-SNAPSHOT.jar
```

Configuration
- Provide your OpenAI key and any provider settings through environment variables or `application.properties`.
- Example (application.properties):
```properties
# Example — set your provider key (adjust to your Spring AI properties)
OPENAI_API_KEY=sk-...replace-me...
# Spring-specific properties (if used in your code)
# spring.ai.openai.api-key=${OPENAI_API_KEY}
```

Notes
- The project depends on Spring AI BOM; consult Spring AI docs for property names and advanced configuration: https://spring.io/projects/spring-ai
- This repository contains the Spring Boot skeleton and model integration. Add your controllers, STT/TTS providers, and persistence as needed.

Where to look
- `pom.xml` — dependency & BOM (spring-ai)
- `src/main/java` — application code (controllers, services)
- `src/main/resources` — configuration

Contributing
- Open an issue or a PR. Keep changes small and include a short description and how to run any new code.

License & contact
- MIT-style (add LICENSE file if needed)
- Developer: Eyob Weldetensay — https://github.com/Yobil-Job — https://www.linkedin.com/in/eyob-weldetensay-a68160254/
