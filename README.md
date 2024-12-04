# Role-Based-Access-Contol-with-Jwt-Authentication
Core Requirements : 
- Implement an authentication system where users can register, log in, and log out securely.
- Implement authorization based on roles (e.g., Admin, User, Moderator). Ensure that each role has specific permissions to access certain resources or endpoints.
- Use secure methods such as JWT or OAuth for managing sessions and user authentication.
- Implement Role-Based Access Control (RBAC), where the access to resources is determined based on the user's assigned role.

# Technologies Used:
## Spring Boot (3.3.6)
- Framework for rapid application development.
- Utilized Spring Web, Spring Security, and Spring Data JPA for building the system.
## Maven
- Dependency and project management tool for compiling and packaging the application.
## Java 1.7
- Programming language used for core development.
## MySQL
- Database for storing user data, roles, and permissions.
## JWT (JSON Web Tokens)
- Used for secure, stateless user authentication and session management.

# Dependencies:
**Spring Web**  : For creating RESTful APIs.
**Spring Security**: To implement secure authentication and authorization.
**MySQL Driver**: To connect and interact with the MySQL database.
**Spring Data JPA**: For object-relational mapping and database interaction.
**Lombok**: For reducing boilerplate code by generating getters, setters, constructors, and more.
**Spring Boot DevTools**: For enabling rapid development with automatic restarts.

# Tools Used:
**Postman**: For API testing and debugging.
**IntelliJ** IDEA for development and debugging.

# System Features:
**Authentication**:
    Users can securely register, log in, and log out using JWT for session management.
**Authorization with RBAC**:
    Role-based access control ensures that resources and endpoints are accessible only to authorized roles like Admin, User, and Moderator.
**Database Integration**:
    User details, roles, and permissions are securely stored in a MySQL database, with JPA for seamless interaction.
**Secure API Endpoints**:
    RESTful APIs are protected using JWT tokens and role-based permissions.

# Security Measures:
- Passwords are securely hashed before being stored in the database.
- JWT tokens are validated to ensure authenticity and prevent unauthorized access.
- Each role is granted specific permissions, which are checked using Spring Security filters before accessing protected endpoints.
