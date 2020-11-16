
package com.sree.springboottest.impl;

import static com.mongodb.client.model.Projections.exclude;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mongodb.client.FindIterable;
import com.sree.springboottest.dao.EmployeeDAO;
import com.sree.springboottest.dao.LeaveRequestDAO;
import com.sree.springboottest.exception.LeaveDaoException;
import com.sree.springboottest.exception.LeaveServiceException;
import com.sree.springboottest.model.Employee;
import com.sree.springboottest.model.LeaveRequest;
import com.sree.springboottest.repository.EmployeeRepository;
import com.sree.springboottest.service.EmployeeService;
import com.sree.springboottest.util.LeaveRequestUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public Employee getEmployee(String employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

}
