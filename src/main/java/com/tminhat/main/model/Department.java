package com.tminhat.main.model;

import java.util.List;

import javax.persistence.*;

@Table(name="departments")
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentCode;
	@Column
	private String departmentName;
	@Column
	private String city;
	@OneToMany(mappedBy="depObj", cascade=CascadeType.ALL)
	private List<Employee> empList;
	//constructors
	public Department() {}
	public Department(String departmentName, String city, List<Employee> empList) {
		super();
		this.departmentName = departmentName;
		this.city = city;
		this.empList = empList;
	}
	//getters and setters
	public int getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
