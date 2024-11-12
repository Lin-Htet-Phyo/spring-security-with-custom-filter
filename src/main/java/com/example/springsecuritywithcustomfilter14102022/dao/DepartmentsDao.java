package com.example.springsecuritywithcustomfilter14102022.dao;


import com.example.springsecuritywithcustomfilter14102022.ds.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsDao extends CrudRepository<Department, Integer> {
}
