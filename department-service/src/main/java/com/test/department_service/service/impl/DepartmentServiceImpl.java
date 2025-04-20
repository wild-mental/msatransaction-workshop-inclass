package com.test.department_service.service.impl;

import org.springframework.stereotype.Service;

import com.test.department_service.entity.Department;
import com.test.department_service.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl 
implements DepartmentService
{

    @Override
    public Department saveDepartment(Department department) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDepartment'");
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartmentById'");
    }

}
