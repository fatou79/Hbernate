package com.fatou.Spring.B00t.Hibernate.service;

import java.util.List;

import com.fatou.Spring.B00t.Hibernate.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);

}
