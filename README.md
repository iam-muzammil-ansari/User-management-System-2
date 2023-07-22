# User Management System

## Table Of Content
- [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [Controller](#controller)
  - [Services](#services)
  - [Repository](#repository)
  - [BeanFactory](#beanfactory)
  - [Database Design](#database-design)
- [Data Structure Used](#data-structure-used)
- [Project Summary](#project-summary)
- [Getting Started](#getting-started)
- [Testing Endpoints](#testing-endpoints)
- [License](#license)

## Frameworks and Language Used
- Spring Boot (version 3.1.1)
- Java (version 17)
- Maven

## Data Flow

### Controller
- `GET /users`: Get a list of all users.
- `POST /users`: Create multiple users.
- `POST /user`: Create a single user.
- `DELETE /user`: Remove a user by their ID.
- `PUT /user/{id}/email/{emailId}`: Update a user's email by their ID.

### Services
- `getAllUsers()`: Get a list of all users.
- `createUsers(List<User> users)`: Create multiple users.
- `createUser(List<User> user)`: Create a single user.
- `removeUser(Integer id)`: Remove a user by their ID.
- `updateEmail(Integer id, String emailId)`: Update a user's email by their ID.

### Repository
- `getUsers()`: Get the list of users.

### BeanFactory
- `getInitializedList()`: Initialize a list of users with a default user.

### Database Design
The project doesn't use a database in the current implementation. It uses a list of users stored in-memory as a placeholder.

## Data Structure Used
- `User`: A model class representing a user with various attributes such as userId, userName, userEmail, password, userContact, userAge, userDOB, and userType.

## Project Summary
This is a User Management System built using Spring Boot, Java, and Maven. It allows you to perform basic CRUD operations on users and demonstrates the use of Spring Boot's validation features.

## Getting Started
To run the User Management System, follow these steps:

1. Clone the project from the repository.
2. Open the project in your preferred Java IDE.
3. Run the `UserManagementSystemApplication` class to start the Spring Boot application.
4. The application will be accessible at `http://localhost:8080`.

## Testing Endpoints
You can test the endpoints using tools like Postman or cURL. Here are some sample requests:

1. Get all users:

   `GET` http://localhost:8080/users


2. Create multiple users:

   `POST` http://localhost:8080/users
Request Body: [{"userName": "Muzzu", "userEmail": "muzzu@example.com", ...}, {"userName": "Ayaan", "userEmail": "ayaan@example.com", ...}]


3. Remove a user by ID: 

     `DELETE` http://localhost:8080/user?id=1


4. Update a user's email by ID:

    `PUT` http://localhost:8080/user/1/email/new_email@example.com



## License
this project is OpenSource.
