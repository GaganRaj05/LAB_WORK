package com.example.CrudWithMySql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudWithMySql.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}