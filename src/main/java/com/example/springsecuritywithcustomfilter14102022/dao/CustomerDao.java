package com.example.springsecuritywithcustomfilter14102022.dao;

import com.example.springsecuritywithcustomfilter14102022.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer,Integer> {
}
