# Team Players REST API

A multi-module Spring Boot application for managing team players.

## Project Structure




markdown
teamplayers/
├── restapi/
│ ├── players/
│ │ └── src/
│ │ └── main/
│ │ └── java/
│ │ └── com/
│ │ └── rimdome/
│ │ └── player/
│ │ └── PlayerController.java
│ └── pom.xml
└── pom.xml


## Prerequisites

- Java 17 or higher
- Maven 3.6.x or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

## Building the Application

- Clone the repository:
  git clone <repository-url>
  cd teamplayers

- Build the project using Maven:
  mvn clean install

- Running the Application
    - Method 1: Using Maven
    - Navigate to the players module directory and run:
        - cd restapi/players
            - mvn spring-boot:run
    - Method 2: Using JAR file
        - After building, you can run the JAR file directly:
            - java -jar restapi/players/target/players-0.0.1-SNAPSHOT.jar
    - Method 3: Using IDE
        - Open the project in your IDE
        - Locate the main class with @SpringBootApplication annotation
            - Right-click and select "Run" or "Debug"

- Accessing the Application
    - Once the application is running, you can access:
        - Base URL: http://localhost:8080
        - TODO: Swagger UI (if configured): http://localhost:8080/swagger-ui.html

    - API Endpoints
        - GET /api/players - List all players
        - GET /api/players/{id} - Get player by ID
        - POST /api/players - Create new player
        - PUT /api/players/{id} - Update player
        - DELETE /api/players/{id} - Delete player

- Configuration
    - The application can be configured through application.properties or application.yml in the players module:
        - server: port: 8080/8081/8082
        - spring:  application: name: team-players-service

- TODO: Testing
    - Run the tests using Maven:
        - mvn test

- License
    - Add your license information here
