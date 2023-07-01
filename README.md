# Todo List Application

<img src="https://github.com/sagarxt/todolist/blob/master/assets/todolist-preview.png?raw=true">

This is a Todo List application built using the Spring framework, MySQL for database management, Thymeleaf for server-side rendering of HTML templates, and HTML/CSS/JS for the front-end.

## Prerequisites

Make sure you have the following software installed on your system:

- Java Development Kit (JDK)
- Spring Boot
- MySQL
- HTML, CSS, and JavaScript

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/sagarxt/todolist.git
   ```

2. Navigate to the project directory:

   ```bash
   cd todo-list-application
   ```

3. Configure the database:

   - Open the `application.properties` file located in the `src/main/resources` directory.
   - Update the database connection properties to match your database setups, like MySQL schema username and password.

4. Build and run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

   The application will start running on `http://localhost:1202`.

## Usage

1. Open a web browser and go to `http://localhost:1202/todo`.

2. You will see the Todo List application interface.

3. Add a new task by entering the task details and clicking the "Add" button.

4. Existing tasks will be displayed in a table with options to edit or delete each task.

5. Use the provided buttons or links to navigate through the application and manage your tasks.

## Technologies Used

- **Spring Boot**: Provides a framework for developing Java applications quickly and easily, with built-in support for dependency injection and web development.
- **Hibernate**: An object-relational mapping (ORM) library that simplifies database interactions by mapping Java objects to database tables.
- **MySQL**: All the data from the application will be stored in the MySQL database.
- **Thymeleaf**: A server-side Java template engine that allows easy integration of data into HTML templates.
- **HTML/CSS/JS**: Standard web technologies for creating the user interface and adding interactivity.

## Folder Structure

- `src/main/java`: Contains the Java source code for the application.
- `src/main/resources`: Contains the configuration files and static resources (HTML, CSS, JS).

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the repository.

## License

This is a minor project for my study. I am inspired from some Youtube videos and some vlogs.
