# Provider Management Service
**Version 0.0.1**

This component is responsible for provider management.

### Current status
Developing the following user story:

**As**: manager  
**need**: a management service
**for**: creating, updating and querying the restaurant's providers.

**Acceptance criteria**
- [ ]  Create new provider
- [ ]  Query provider catalog
- [ ]  Update existing provider

### Next steps  

- Implement integration tests for creating a new provider.
- Production code for creating a new provider.
- Create a CI pipeline on Jenkins


## Technological stack for this component
- Spring Boot
    - [x]  spring-boot-starter-test
    - [x]  spring-boot-starter-data-jpa
    - [ ]  spring-boot-starter-validation
    - [ ]  spring-boot-starter-security
    - [ ]  spring-boot-starter-web
- Spring Cloud
    - [ ]Externalized Configuration
    - [ ] Service registration and discovery
- Continuous Integration
    - [ ] Jenkins
- AWS
    - [ ] Amazon RDS for MySQL
    - [ ] Amazon API Gateway
    - [ ] Amazon ECS
- Continuous inspection of code quality
    - [x] Spotbus
    - [x] JaCoCo
    - [ ] Checkstyle
    - [ ] SonarQube

