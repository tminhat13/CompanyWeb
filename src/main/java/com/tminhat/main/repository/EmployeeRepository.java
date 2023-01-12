package com.tminhat.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tminhat.main.model.Department;
import com.tminhat.main.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	public List<Employee> findByDepObj(Department dept);

	public List<Employee> findByEmpName(String itemname);
}
