
package com.sree.springboottest.dao;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.sree.springboottest.exception.LeaveDaoException;
import com.sree.springboottest.model.Employee;

public interface EmployeeDAO {

	Employee getEmployeeById(String employeeId);

}
