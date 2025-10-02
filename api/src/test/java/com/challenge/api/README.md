# Entry-Level Java Challenge

A simple Spring Boot REST API for managing employees.  
This project demonstrates a basic CRUD service (`Create`, `Read`, `Update`, `Delete`) using an in-memory list as the data store.  
It’s designed as an entry-level challenge to practice Java, Spring Boot, Gradle, and RESTful APIs.

---

## Requirements
- **JDK 17**
- **Gradle Wrapper** (included in the project, use `./gradlew`)

---

## Build & Run

Clone the repository:

```bash
git clone https://github.com/Hoffy923/entry-level-java-challenge.git
cd entry-level-java-challenge/api
```

Build and run the application:

```bash
# Clean and build
./gradlew clean build

# Run the Spring Boot app
./gradlew bootRun
```

The application will start on **http://localhost:8080** by default.

---

## Endpoints

### Get all employees
```bash
curl -i http://localhost:8080/employees
```

### Create a new employee
```bash
curl -i -X POST http://localhost:8080/employees \
  -H "Content-Type: application/json" \
  -d '{"id":1,"name":"Jett Hoffmeier","role":"Engineer"}'
```

### Get employee by ID
```bash
curl -i http://localhost:8080/employees/1
```

### Update employee by ID
```bash
curl -i -X PUT http://localhost:8080/employees/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Jett H.","role":"Senior Engineer"}'
```

### Delete employee by ID
```bash
curl -i -X DELETE http://localhost:8080/employees/1
```

---

## Example Session

```bash
# Start with empty list
curl -i http://localhost:8080/employees

# Add a new employee
curl -i -X POST http://localhost:8080/employees \
  -H "Content-Type: application/json" \
  -d '{"id":1,"name":"Jett Hoffmeier","role":"Engineer"}'

# Fetch by ID
curl -i http://localhost:8080/employees/1

# Update the employee
curl -i -X PUT http://localhost:8080/employees/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Jett H.","role":"Senior Engineer"}'

# Delete the employee
curl -i -X DELETE http://localhost:8080/employees/1

# Confirm deletion
curl -i http://localhost:8080/employees
```

---

## Testing (Optional)

Unit and integration tests are **not required** for this challenge.  
If you decide to add them, please use **JUnit 5** and follow standard conventions.

Resources:
- [Spring Web Test tutorial](https://spring.io/guides/gs/testing-web)  
- [JUnit 5 guide](https://www.baeldung.com/junit-5)  

---

## Notes

- Data is stored in an in-memory list and will reset each time the application restarts.  
- This project focuses on demonstrating basic REST API structure, not persistence or database usage.  

---

## License
This project is for educational purposes as part of an entry-level Java coding challenge.  
