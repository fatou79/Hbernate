package com.fatou.Spring.B00t.Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatou.Spring.B00t.Hibernate.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
