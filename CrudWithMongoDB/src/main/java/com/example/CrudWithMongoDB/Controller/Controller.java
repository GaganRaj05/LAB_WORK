package com.example.CrudWithMongoDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudWithMongoDB.Repository.StudentRepository;
import com.example.CrudWithMongoDB.Model.Student;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/get")
    public List<Student> getData() {
        return studentRepo.findAll();
    }
    @PostMapping("/save")
    public String saveData(@RequestBody Student student) {
        try {
            studentRepo.save(student);
            return "success";
        }
        catch(Exception e) {
            return "error";
        }
    }
    @PutMapping("/update/{id}")
    public String updateData(@PathVariable int id, @RequestBody Student student) {
        try {
            student.setId(id);
            studentRepo.save(student);
            return "success";
        }
        catch(Exception e) {
            return "error";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id) {
        try {
            studentRepo.deleteById(id);
            return "success";
        }
        catch(Exception e) {
            return "error";
        }
    }
}
