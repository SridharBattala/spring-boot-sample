
package com.sree.springboottest.dao.impl;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.UpdateOptions;
import com.sree.springboottest.dao.EmployeeDAO;
import com.sree.springboottest.dao.LeaveRequestDAO;
import com.sree.springboottest.exception.LeaveDaoException;
import com.sree.springboottest.model.Employee;
import com.sree.springboottest.repository.EmployeeRepository;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Employee getEmployeeById(String employeeId) {
		LOGGER.info("Get Employee By Id=" + employeeId);
		return employeeRepository.findById(employeeId).get();
	}

}
