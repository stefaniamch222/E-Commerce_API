# E-Commerce Backend API

A lightweight e-commerce backend application developed with **Java 25** and **Spring Boot 4.1.1**. This project provides robust REST API endpoints for managing a product catalog using an embedded in-memory H2 database.

## 🚀 Features

- **Product Catalog Management**: RESTful endpoints designed for retrieving product records and registering new items.
- **Embedded Database**: Leverages an H2 in-memory database configuration for rapid local integration and testing.
- **Automated Data Seeding**: Automatically populates sample product data upon application startup via `CommandLineRunner`.
- **Standardized Architecture**: Adheres to a clean, layered Spring Boot architecture (`Controller`, `Service`, `Repository`, `Model`).

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 25)
- **Framework:** Spring Boot (v4.1.1)
- **Database:** H2 Database (In-memory)
- **Persistence:** Spring Data JPA / Hibernate
- **Build Tool:** Maven

---

## 📁 Project Structure

```text
backend-api/
│
├── src/main/java/com/ecommerce/backend/
│   ├── BackendApiApplication.java       # Main entry point and initial data seeding
│   ├── controller/
│   │   └── ProductController.java       # REST API endpoint handlers
│   ├── model/
│   │   └── Product.java                 # Entity model representing products
│   ├── repository/
│   │   └── ProductRepository.java       # Data access interface (JpaRepository)
│   └── service/
│       └── ProductService.java          # Business logic implementation
│
├── src/main/resources/
│   └── application.properties           # Database and application properties
│
└── pom.xml                              # Maven configuration and dependencies
