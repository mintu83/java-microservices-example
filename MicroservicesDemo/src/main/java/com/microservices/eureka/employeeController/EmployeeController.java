package com.microservices.eureka.employeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.eureka.employeeService.EmpOperationService;
import com.microservices.eureka.empoyee.Employee;
/**
 * 
 * @author Mintu
 * a REST service which registers itself at the registry (Eureka Client)
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@ComponentScan(basePackages={"com.microservices.eureka.employeeService","com.microservices.eureka.employeeController"})
public class EmployeeController {

	protected EmpOperationService empOperationService ;
	
	@Autowired
	public EmployeeController(EmpOperationService empOperationServiceObj) {
		this.empOperationService = empOperationServiceObj;
	}
	@RequestMapping("/employee/{employeeNumber}")
	public Employee EmployeeByNumber(@PathVariable("employeeNumber") String employeeNumber) {
		Employee employee = empOperationService.findByNumber(employeeNumber);
		return employee;
	}
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "application-client");
		SpringApplication.run(EmployeeController.class, args);
	}
}
