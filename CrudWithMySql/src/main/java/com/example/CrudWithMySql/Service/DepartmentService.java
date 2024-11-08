package com.example.CrudWithMySql.Service;

import java.util.List;
import com.example.CrudWithMySql.Entity.Department;

public interface DepartmentService {
    public String saveData(Department department);
    public String deleteData(int departmentId);
    public String updateData(Department department, int departmentID);
    public List<Department> getData();
    
} 