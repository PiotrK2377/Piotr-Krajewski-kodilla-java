package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeFacadeTestSuite {

    @Autowired
    private EmployeeFacade employeeFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindEmployeeNameByFragment() {
        //Given
        Employee employee = new Employee("Johnny", "McDowells");
        employeeDao.save(employee);

        //When
        int sizeFragmentFirstname = employeeFacade.getEmployeeByFragmentName("ohn").size();
        int sizeFragmentLastname = employeeFacade.getEmployeeByFragmentName("owel").size();

        //Then
        assertEquals(1, sizeFragmentFirstname);
        assertEquals(1, sizeFragmentLastname);

        //CleanUp
        employeeDao.deleteById(employee.getId());
        employeeDao.deleteAll();
    }

}