# Spring Batch Session – Barebone Starter
This is intentionally a skeleton. It contains no Job, Step, ItemReader, ItemProcessor or ItemWriter implementation. Participants add those live during training.
## Baseline
- Java 17; Spring Boot 3.3.5
- Spring Batch version managed by Spring Boot
- H2 in-memory database for the first basic application lab
- Maven
## Run
```bash
mvn clean test
mvn spring-boot:run
```
Open http://localhost:8080/health. H2 console: http://localhost:8080/h2-console; JDBC URL `jdbc:h2:mem:batchdb`, user `sa`, blank password.
## Not included intentionally
No Job/Step beans, no readers/processors/writers, no JobLauncher endpoint, no MySQL/Docker, no XML processing, no completed lab solutions.
Use the companion instructor guide to add each capability progressively.
