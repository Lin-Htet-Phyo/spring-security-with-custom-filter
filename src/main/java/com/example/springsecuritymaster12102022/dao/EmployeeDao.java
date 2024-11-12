package com.example.springsecuritymaster12102022.dao;

import com.example.springsecuritymaster12102022.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
