# UserEntryForm
<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://i.imgur.com/6wj0hh6.jpg" alt="Project logo"></a>
</p>

## 📝 Table of Contents
- [About](#about)
- [Deployment](#deployment)
- [Built Using](#built_using)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>
It is a Simple User Entry Form Where User Can Submit there Name and any Entry which he want.
This Spring Boot Maven project is a simple application for managing "entries" with basic CRUD functionality. It features a RESTful API with endpoints to create (`POST /entries`) and retrieve (`GET /entries`) entries, leveraging Spring Data JPA for database operations on an H2 in-memory database. The project includes a main application class (`UserEntryApplication`), a REST controller (`EntryController`), an entity class (`Entry`), a repository interface (`EntryRepository`), and an HTML template (`index.html`) for a basic web page. Configuration is managed through `application.properties`.

![Screenshot (279)](https://github.com/user-attachments/assets/a3231bdc-a2d9-4ace-9041-d7d0219db74f)


## 🚀 Deployment <a name = "deployment"></a>
Use the Spring Boot REST controller that handles HTTP requests.
To deploy the Spring Boot Maven project, first build it using `mvn clean package` to create a JAR file in the `target` directory. Transfer this JAR file to your target server. On the server, run the application with `java -jar target/UserEntry-0.0.1-SNAPSHOT.jar`. Ensure necessary ports are open and verify the deployment by accessing the application endpoints via a web browser or API client. For production, consider running it as a service using systemd for automatic startup and management.

## ⛏️ Built Using <a name = "built_using"></a>
1. Java
2. Spring Boot Application 
3. MySQL Database

## ✍️ Authors <a name = "authors"></a>
- Vishal borase
