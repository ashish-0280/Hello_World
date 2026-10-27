# Hello_World

![Build](https://github.com/ashish-0280/Hello_World/actions/workflows/maven.yml/badge.svg)

A small Spring Boot (Java 17, Maven) REST API that returns greetings as JSON.

## Run

```
./mvnw spring-boot:run
```

The app starts on http://localhost:8080.

## Endpoints

| Endpoint | Description |
| --- | --- |
| `GET /greeting` | Greets "World" |
| `GET /greeting?name=Ashish` | Greets by name |
| `GET /greeting/{name}` | Greets by path variable |

Example:

```
$ curl "localhost:8080/greeting?name=Ashish"
{"id":1,"message":"Hello, Ashish!","timestamp":"2026-10-27T06:30:00Z"}
```

## Test

```
./mvnw test
```

## Ideas for next steps

Persist greeting history (MongoDB/H2), add Swagger docs, Actuator, Docker.
