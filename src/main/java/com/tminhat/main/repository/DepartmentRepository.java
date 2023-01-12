package com.tminhat.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tminhat.main.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
