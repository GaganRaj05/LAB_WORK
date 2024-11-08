package com.example.CrudWithMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudWithMongoDB.Model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

    
} 
