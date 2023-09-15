package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getEmployeeByFragmentName(String nameFragment) {
        String searchNameFragment = "%" + nameFragment + "%";
        return employeeDao.findEmployeesByNameFragment(searchNameFragment);
    }
}
