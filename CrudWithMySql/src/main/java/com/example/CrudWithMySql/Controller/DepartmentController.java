package com.example.CrudWithMySql.Controller;

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

import com.example.CrudWithMySql.Entity.Department;
import com.example.CrudWithMySql.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/get")
    public List<Department> getData() {
        return departmentService.getData();
    }
    @PostMapping("/save")
    public String saveData(@RequestBody Department department) {
        try {
            departmentService.saveData(department);
            return "success";
        }
        catch (Exception e) {
            return "error";
        }
    }
    @PutMapping("/update/{id}")
    public String updateData(@PathVariable int id, @RequestBody Department department) {
        try {
            departmentService.updateData(department, id);
            return "success";
        }
        catch (Exception e) {
            return "error";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id, @RequestBody Department department) {
        try {
            departmentService.deleteData(id);
            return "success";
        }
        catch(Exception e) {
            return "error";
        }
    }
}
