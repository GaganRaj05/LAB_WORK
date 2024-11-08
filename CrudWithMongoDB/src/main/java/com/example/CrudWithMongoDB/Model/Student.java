package com.example.CrudWithMongoDB.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
    private int id;
    private String name;
    private String address;

    Student() {}

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public int getId() {
        return this.id;
    }
}
