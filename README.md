# Recall API

> **Knowledge should be remembered, not merely stored.**

Backend API for **Recall** — an AI-powered Personal Knowledge Management (PKM) platform that helps users store, organize, search, and interact with their personal knowledge.

## Tech Stack

- **Language**: Java 25 SDK
- **Framework**: Spring Boot 3.4.2
- **Security**: Spring Security, JJWT (JSON Web Token)
- **Persistence**: Spring Data JPA, PostgreSQL
- **Mapping & Utilities**: Lombok, MapStruct (`lombok-mapstruct-binding`)
- **Build Tool**: Maven

## Package Structure

```text
vn.vinhthai.recall
├── auth          # Authentication controllers, services, DTOs
├── user          # User entity, repository, MapStruct mapper
├── document      # Document management (Sprint 2)
├── ai            # AI Summary & Chat services (Sprint 3/4)
├── search        # Knowledge search
├── common        # ApiResponse, BaseEntity
├── config        # SecurityConfig, WebConfig
├── security      # JwtProvider, JwtFilter, CustomUserDetails
└── exception     # GlobalExceptionHandler, CustomExceptions
```

## Running Locally

### 1. Start PostgreSQL Container

```bash
docker-compose up -d
```

### 2. Run Spring Boot Application

```bash
./mvnw spring-boot:run
```

The API server will run at `http://localhost:8080/api/v1`.

## Endpoints (Sprint 1: Auth)

- `POST /api/v1/auth/register` — Register a new account
- `POST /api/v1/auth/login` — Login & receive JWT token
- `GET /api/v1/auth/me` — Fetch current user profile (requires Bearer token)
