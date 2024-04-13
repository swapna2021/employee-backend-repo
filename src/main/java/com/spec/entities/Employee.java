package com.spec.entities;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee_table")//it will change table to name in the database
public class Employee {
	
	@Column(name="employeeName")//will change column name in the table
	private String empName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private double empSalary;
	@Pattern(regexp = "^[6789][0-9]{9}$",
	message = "please enter a mobile number with 10 digit length starting with a number among 6 to 9")
	private String mobileNum;
	@Email(message = "enter proper email ")
	private String email;
	private String department;
	private int age;
	private String designation;
	public Employee() {
		super();
	}
	public Employee(String empName, int empId, double empSalary,
			@Pattern(regexp = "^[6789][0-9]{9}$", message = "please enter a mobile number with 10 digit length starting with a number among 6 to 9") String mobileNum,
			@Email(message = "enter proper email ") String email, String department, int age, String designation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.mobileNum = mobileNum;
		this.email = email;
		this.department = department;
		this.age = age;
		this.designation = designation;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + ", mobileNum="
				+ mobileNum + ", email=" + email + ", department=" + department + ", age=" + age + ", designation="
				+ designation + "]";
	}
	

		
	

}
