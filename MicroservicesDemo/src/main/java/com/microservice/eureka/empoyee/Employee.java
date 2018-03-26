package com.microservice.eureka.empoyee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Mintu
 * POJO contains emplyoyee details
 */
public class Employee  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empName;
	private String empJobDetails;
	private int empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpJobDetails() {
		return empJobDetails;
	}
	public void setEmpJobDetails(String empJobDetails) {
		this.empJobDetails = empJobDetails;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
//	public List<Employee> getAllEmployess(){
//		List<Employee> employeesLst = new ArrayList<>();
////		Employee employee = new Employee();
////		employee.setEmpId(1);
////		employee.setEmpName("Mr. Associate");
////		employee.setEmpJobDetails("Associate-Projects");
////		employeesLst.add(employee);
////		employee = new Employee();
////		employee.setEmpId(2);
////		employee.setEmpName("Mr. Sr. Associate");
////		employee.setEmpJobDetails("Sr. Associate-Projects");
////		employeesLst.add(employee);
////		employee = new Employee();
////		employee.setEmpId(3);
////		employee.setEmpName("Mr. Manger");
////		employee.setEmpJobDetails("Manager-Projects");
////		employeesLst.add(employee);
//		return employeesLst;
//	}
	
}
