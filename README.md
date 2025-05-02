# ECMart – E-Commerce Microservices System

ECMart is a full-stack backend project implementing a modern e-commerce platform using **Microservices Architecture**. The system is designed for scalability, modularity, and clean separation of concerns. Each core business function is built as an independent Spring Boot microservice.

## 💡 Project Overview

This system simulates a real-world e-commerce application backend, covering user registration, product listings, order placement, payment processing, and notifications. Each service communicates independently and is capable of being scaled, tested, and deployed in isolation.

## 📁 Project Structure

```text
ECMart/
├── user-service/           → Manages user registration, login, and profiles
├── product-service/        → Handles product catalog and inventory
├── order-service/          → Manages cart, orders, and order status
├── payment-service/        → Simulates payment transactions
├── notification-service/   → Sends out emails/SMS for updates
├── api-gateway/            → Single entry point for all external requests
├── service-registry/       → Eureka Server for service discovery
├── config-server/          → Centralized configuration management
```

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Build Tool:** Maven
- **Communication:** REST (HTTP)
- **Service Registry:** Eureka
- **Gateway:** Spring Cloud Gateway
- **Config Management:** Spring Cloud Config
- **Testing Tool:** Postman

## ✅ Completed Services

### User Service
- Register new users
- Fetch user by email
- Full integration with MySQL
- Validated and tested using Postman: http://localhost:8082/api/users

### Product Service
- Navigate to product-service/
- Configure application.propertie
- Run ProductServiceApplication.java
- Test using Postman at http://localhost:8083/api/products

### Order Service (Port 8084)
- Place new orders
- Fetch orders by ID or User ID
- Update order status
- Delete/cancel orders
- Test using Postman at http://localhost:8084/api/orders

### 4. Payment Service (`8085`)
- Process payments for a given order
- Save and retrieve payment status (`SUCCESS`, `FAILED`, etc.)
- Retrieve payment by ID or by `orderId`
- Fully integrated with MySQL and tested using Postman


### 🚀 In Progress
⏳ payment-service – simulate payment flow

⏳ notification-service – email/SMS alerts

🔜 API Gateway – centralized access point

🔜 Eureka Service Registry – auto-discovery

🔜 Config Server – centralized configs for all services

🔜 Docker support (via docker-compose)

🔜 CI/CD with GitHub Actions



## 🔧 Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- MySQL installed and running
- IDE (IntelliJ IDEA recommended)

### MySQL Setup
Create a database before running user-service:

```sql
CREATE DATABASE ecmart_userdb;
CREATE DATABASE ecmart_productdb;  
CREATE DATABASE ecmart_orderdb;
CREATE DATABASE ecmart_paymentdb;
```

## ▶️ Running User Service

1. Navigate to the `user-service/` directory  
2. Open in IDE  
3. Configure `application.properties` with your MySQL credentials  
4. Run the main class `UserServiceApplication.java`  
5. Test endpoints using Postman: http://localhost:8082/api/users

   
## 🚀 In Progress

- Implementing product, order, and payment services  
- Introducing inter-service communication  
- Adding authentication and JWT  
- Dockerizing the system  
- Centralized logging and monitoring  

## 📌 License

>This is an educational backend architecture project. Use it freely for learning or showcasing your backend skills.

