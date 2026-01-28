# In-Memory Library Management API

## 1. Project Title & Goal
A Spring Boot REST API that manages a library book inventory using in-memory storage without using any database.
## 2. Setup Instructions
Run the following commands to start the application locally:
bash
mvn clean install
mvn spring-boot:run
The application will start on:
http://localhost:8080.
## 3.the Logic (How you thought)
# why did you choose this approach?
I chose an in-memory List to store book data because the problem statement strictly restricted the use of databases.
Spring Boot was selected for its simplicity and fast REST API development.
# What was the hardest bug you faced, and how did you fix it?
The hardest issue was handling incorrect request mappings and JSON binding errors that resulted in 400 Bad Request responses.
This was fixed by correcting path variable syntax, using the @RequestBody annotation properly, and adding a no-args constructor using Lombok.
## 4.Output Screenshots
Get All Books
Add Book
# 5. Future Improvements
If I had 2 more days, I would:
Add validation to prevent duplicate book IDs
Implement centralized exception handling
Add Swagger UI for API documentation
Persist data using a database

