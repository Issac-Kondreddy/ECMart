# ECMart – E-Commerce Microservices System

**ECMart** is a full-stack backend microservices project simulating a modern e-commerce platform using **Java**, **Spring Boot**, and **MySQL**. Each business function is built as an independent Spring Boot microservice, enabling scalability, modularity, and clean separation of concerns.

---

## 💡 Project Overview

This system includes:

- 👤 User Management
- 📦 Product Catalog
- 🛒 Order Placement
- 💳 Payment Simulation
- 📩 Notifications

Each service runs independently and communicates over REST APIs.

---

## 📁 Project Structure

```text
ECMart/
├── user-service/           → Manages user registration, login, and profiles
├── product-service/        → Handles product catalog and inventory
├── order-service/          → Manages cart, orders, and order status
├── payment-service/        → Simulates payment transactions
├── notification-service/   → Sends out emails/SMS for updates
├── api-gateway/            → Single entry point for all external requests (upcoming)
├── service-registry/       → Eureka Server for service discovery (upcoming)
├── config-server/          → Centralized configuration management (upcoming)
```
## 🛠️ Tech Stack
```
Language         : Java 17+
Framework        : Spring Boot 3.x
Database         : MySQL
ORM              : Spring Data JPA (Hibernate)
Build Tool       : Maven
API Protocol     : REST (HTTP)
Service Registry : Eureka (Spring Cloud)
API Gateway      : Spring Cloud Gateway
Config Server    : Spring Cloud Config
Testing Tool     : Postman
```

## ✅ Completed Microservices
### 🧍 User Service (8082)
* Register and fetch users by email
* MySQL DB: ecmart_userdb
* Test endpoint: http://localhost:8082/api/users

### 📦 Product Service (8083)
* Add, update, delete, and fetch products
* Find product by name
* MySQL DB: ecmart_productdb
* Test endpoint: http://localhost:8083/api/products

### 🛒 Order Service (8084)
* Place orders, update, delete, and fetch by ID/User
* MySQL DB: ecmart_orderdb
* Test endpoint: http://localhost:8084/api/orders

### 💳 Payment Service (8085)
* Process and record payments
* Retrieve payment by ID or order ID
* MySQL DB: ecmart_paymentdb
* Test endpoint: http://localhost:8085/api/payments

### 📩 Notification Service (8086)
* Simulates EMAIL/SMS notification sending
* Console-based mock delivery
* Stores history in ecmart_notificationdb
* Test endpoint: http://localhost:8086/api/notifications

## 🧰 Prerequisites
```text
Java:      17 or higher
Maven:     Installed and configured
MySQL:     Installed and running
IDE:       IntelliJ IDEA or VS Code
```

🗃️ MySQL Setup
Run these in MySQL before launching services:

```sql
CREATE DATABASE ecmart_userdb;
CREATE DATABASE ecmart_productdb;
CREATE DATABASE ecmart_orderdb;
CREATE DATABASE ecmart_paymentdb;
CREATE DATABASE ecmart_notificationdb;
```
▶️ How to Run Each Service
🧍 User Service
```bash
cd user-service
# Configure DB in application.properties
# Run UserServiceApplication.java
```
📦 Product Service
```bash
cd product-service
# Run ProductServiceApplication.java
```
🛒 Order Service
```bash
cd order-service
# Run OrderServiceApplication.java
```
💳 Payment Service
```bash
cd payment-service
# Run PaymentServiceApplication.java
```
📩 Notification Service
```bash
cd notification-service
# Run NotificationServiceApplication.java
```
🌐 Eureka Server
```bash
cd service-registry
mvn spring-boot:run
```

🚀 Upcoming Enhancements
* 🔐 Authentication & Authorization (JWT)
* 🌐 API Gateway (Spring Cloud Gateway)
* 📘 Central Config Server
* 🐳 Docker & Docker Compose
* ⚙️ CI/CD using GitHub Actions
* 📊 Logging and Monitoring (ELK, Zipkin)

📌 License
>This is an open-source educational project created for learning purposes.
Feel free to fork, contribute, or showcase in your backend portfolio.
