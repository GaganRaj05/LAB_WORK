package com.example.CrudWithMySql.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudWithMySql.Entity.Department;
import com.example.CrudWithMySql.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    
    @Autowired
    private DepartmentRepository departmentRepository;

    public String deleteData(int departmentID)  {
        departmentRepository.deleteById(departmentID);
        return "success";
    }
    public List<Department> getData() {
        return departmentRepository.findAll();
    }
    public String saveData(Department department) {
        departmentRepository.save(department);
        return "success";
    }
    public String updateData(Department department, int departmentId) {
        Department depDB = departmentRepository.findById(departmentId).get();
        
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }        
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        
        departmentRepository.save(depDB);
        return "success";
    }
}
