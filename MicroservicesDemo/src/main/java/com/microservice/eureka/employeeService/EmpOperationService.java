package com.microservice.eureka.employeeService;

import java.util.List;

import com.microservice.eureka.empoyee.Employee;

/**
 * 
 * @author Mintu
 * A simple service class
 */
public interface EmpOperationService {

	public Employee findByNumber(String employeeNumber);

	public List<Employee> findEmployeesByDept(String dept);

}
