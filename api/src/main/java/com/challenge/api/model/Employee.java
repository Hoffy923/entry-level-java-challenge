package com.challenge.api.model;

public class Employee {
    private Long id;
    private String name;
    private String role;

    // Default constructor (needed by Spring when deserializing JSON)
    public Employee() {}

    // Constructor with fields
    public Employee(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
