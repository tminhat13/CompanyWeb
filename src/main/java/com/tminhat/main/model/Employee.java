package com.tminhat.main.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Table(name="employees")
@Entity
public class Employee {
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
	    strategy = "org.hibernate.id.UUIDGenerator"
	    )
	@Column(updatable = false, nullable = false)
	private String empCode;
	@Column
	private String empName;
	@Column
	private double salary;
	@ManyToOne
	@JoinColumn(name="depObj")
	private Department depObj;
	//constructors
	public Employee() {}
	public Employee(String empName, double salary, Department depObj) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.depObj = depObj;
	}
	//setters and getters
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepObj() {
		return depObj;
	}
	public void setDepObj(Department depObj) {
		this.depObj = depObj;
	}
	
}
