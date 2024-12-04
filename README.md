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

  ![image](https://github.com/user-attachments/assets/18d22d06-0958-4583-b8b9-50805651bc4a)
  
## Implementaion 
![image](https://github.com/user-attachments/assets/e9708894-d17f-4ce3-985f-2c69faed52de)


## Postman API Testing - Authentication and Authorization
sign up as users(default)
![image](https://github.com/user-attachments/assets/a797d7e7-4b41-414d-87d0-bfed458d382e)

signup as admin
![image](https://github.com/user-attachments/assets/b6b35296-1885-4311-9689-1fa2db4e5a48)

signup as moderator
![image](https://github.com/user-attachments/assets/86513df8-8b94-44cb-bc4c-ab84ecbc46c6)

## Data Stored in Database
![image](https://github.com/user-attachments/assets/262bcc51-f307-4749-a563-a5fd42853ca9)


login 
![image](https://github.com/user-attachments/assets/42aa9e28-6240-495e-b965-86edc37df5fa)


### Admin role has full access to all resources
Admin 
![image](https://github.com/user-attachments/assets/10a1c24f-2441-480a-b0c3-9c7ec933c144)
user
![image](https://github.com/user-attachments/assets/756f9cca-5798-421a-9500-cbc22b815f82)
moderator
![image](https://github.com/user-attachments/assets/0c640620-e10b-411e-9761-c6e9c4e1d986)




### Moderator 
Moderator
![image](https://github.com/user-attachments/assets/e1adeb57-cb34-46c1-bfab-af6eb0a687ab)
user
![image](https://github.com/user-attachments/assets/9bb6dbfc-6bc1-427f-80d4-0463395ee0cb)

moderator cannot access to admin
![image](https://github.com/user-attachments/assets/e454f35a-4dbb-4216-8346-b5deb1ce20fd)


### User
user 
![image](https://github.com/user-attachments/assets/10c1873e-0c50-47c7-84ba-75af2b292b21)

user cannot access to moderator and admin 
![image](https://github.com/user-attachments/assets/5db43b20-60ca-4be4-b28a-205eba6866f7)
![image](https://github.com/user-attachments/assets/33061f6b-78c3-4e4f-b677-1d870bc9b96e)







