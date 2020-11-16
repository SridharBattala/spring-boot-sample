package com.sree.springboottest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.sree.springboottest.model.Employee;

@Service
public interface EmployeeService {
	Employee getEmployee(String employeeId);
}
