# Employee Servce 
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/517116d5d0da4201b433592ad231522a)](https://www.codacy.com/app/islasjuanp/employee-service?utm_source=github.com&utm_medium=referral&utm_content=islasjuanp/employee-service&utm_campaign=badger)
[![Build Status](https://travis-ci.org/islasjuanp/employee-service.svg?branch=master)](https://travis-ci.org/islasjuanp/employee-service)
[![Coverage Status](https://coveralls.io/repos/github/islasjuanp/employee-service/badge.svg?branch=master)](https://coveralls.io/github/islasjuanp/employee-service?branch=master)

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

## Configure environment

### Rerun the code generator:
```bash
mvn clean generate-sources -Pgenerate
```

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