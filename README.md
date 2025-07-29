# Microservices Project: User & Profile Services

This project contains two Spring Boot microservices:

- `user-service` running on port `9001`
- `profile-service` running on port `9000`

postman collection for 2 services, attached in root directory (devotel Assigment.postman_collection.json)

Each service runs independently and can communicate with others via REST if needed.

---

## Prerequisites

To run the services locally, make sure you have the following installed:

- Java 17 or 11
- Maven
- Git
- An IDE (e.g., IntelliJ, VS Code)

---

## Database

Both services use **H2** (in-memory database), so there's no need to install or configure any external database.

You can also use the built-in H2 web console to view the data if needed.

---

## Running the Services


After running the projects , swagger links will be accessed : 

localhost:9001/swagger-ui/index.html (profile-ervice)

localhost:9000/swagger-ui/index.html (user-service)


You can run each service individually using Maven.

### Run `services`:

```bash
cd user-service
mvn spring-boot:run

Runs at: http://localhost:9001

cd profile-service
mvn spring-boot:run

Runs at: http://localhost:9000


To package each service as a standalone executable JAR:

cd user-service
mvn clean package

cd ../profile-service
mvn clean package





