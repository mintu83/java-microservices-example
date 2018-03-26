package com.microservices.eureka.employeeService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.eureka.empoyee.Employee;
/**
 * 
 * @author Mintu
 * A implementation class of service
 */
@Service
public class EmpOperationServiceImpl implements EmpOperationService{

	@Override
	public Employee findByNumber(String employeeNumber) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("Mr. Associate");
		employee.setEmpJobDetails("Associate-Projects");
		return employee;
	}

	@Override
	public List<Employee> findEmployeesByDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}

}
