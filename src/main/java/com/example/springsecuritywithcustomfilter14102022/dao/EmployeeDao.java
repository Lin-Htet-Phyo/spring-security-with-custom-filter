package com.example.springsecuritywithcustomfilter14102022.dao;

import com.example.springsecuritywithcustomfilter14102022.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
