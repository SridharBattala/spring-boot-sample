package com.sree.springboottest.repository;

import org.springframework.stereotype.Repository;

import com.sree.springboottest.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
