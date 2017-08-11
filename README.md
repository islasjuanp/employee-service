# Employee Servce 


## Description 
Microservices are a compilation of independently deployable, small and modular application services. 
Each microservice has defined input and output exposed through RESTful endpoints. 
As a result, you can scale, replace and link to other services, such as caching, 
without any architectural changes.

In this new Java microservices massive open online course (MOOC), 
you will create your own microservices using Spring Boot. 
With Spring Boot, you will be able to develop a stand-alone, 
production grade application, in easy to deploy JAR or WAR formats.

Topics covered:
1. Introduction to REST and Microservices
2. Building a RESTful Java Application with Spring Boot
3. Automating Build and Deploy with Developer Cloud Services 

## Run Application 

### Run integration test
```bash
mvn clean install
```

### Run unit test
```bash
mvn clean test
```

### Run Main Application
```bash
java -jar target/Employee-Service-${version}.jar
```