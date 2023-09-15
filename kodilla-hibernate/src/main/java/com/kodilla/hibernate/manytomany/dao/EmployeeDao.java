package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> findEmployeeByLastname(@Param("LASTNAME") String lastname);

    @Query("SELECT e FROM Employee e WHERE e.firstname LIKE ?1 OR e.lastname LIKE ?1")
    List<Employee> findEmployeesByNameFragment(String nameFragment);
}
