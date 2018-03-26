package com.microservice.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.microservices.eureka.employeeService.EmpOperationService;
import com.microservices.eureka.employeeService.EmpOperationServiceImpl;
import com.microservices.eureka.empoyee.Employee;
/**
 * 
 * @author Mintu
 * A Rest client which is able to consume microservice operation
 */
@Configuration
@ComponentScan(useDefaultFilters = false)
public class EmployeeOperationServiceConsumer {
@LoadBalanced
@Bean
RestTemplate restTemplate() {
	return new RestTemplate();
}
@Autowired
@LoadBalanced
protected RestTemplate restTemplate;


@Autowired
private static EmpOperationService empOperationService;

@Bean
public static EmpOperationService empOperationService() {
	return new EmpOperationServiceImpl();
}
public EmployeeOperationServiceConsumer(){
	
}
/*@Autowired
public EmployeeOperationServiceConsumer(EmpOperationService empOperationServiceObj ){
	EmployeeOperationServiceConsumer.empOperationService = empOperationServiceObj;
}*/
public Employee findByNumber(String accountNumber) {
	
	return restTemplate().getForObject("http://192.168.1.6:8910/" + "/employee/{accountNumber}",
			Employee.class, accountNumber);
}

public static void main(String[] args){
	//System.setProperty("spring.config.name", "consumer");
	//SpringApplication.run(EmployeeOperationServiceConsumer.class, args);
//Call type 1
/*	EmployeeOperationServiceConsumer consumer = new EmployeeOperationServiceConsumer();
	Employee employee = consumer.findByNumber("1");
	System.out.println("Success!!! Mocroservices output :--> " +employee);*/
//Call type 2	
	Employee emploNew = empOperationService().findByNumber("1");
	System.out.println("Success!!! Mocroservices output :--> " +emploNew);
}


}
