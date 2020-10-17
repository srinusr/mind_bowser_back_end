package com.smc.SocialMedia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "employee",uniqueConstraints = { 
		@UniqueConstraint(columnNames = "email") 
	})
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empid;

	@NotBlank
	@Size(max = 100)
	@Email
	private String email;

	
	@Size(max = 100)
	private String firstName;
	

	@Size(max = 100)
	private String lastName;
	

	@Size(max = 1000)
	private String city;
	
	@Size(max = 100)
	private String dob;
	

	@Size(max = 200)
	private String adress;
	
	@Size(max = 13)
	private String phone;

	public Employee( String firstName,String lastName, String email, String phone ,String city,String adress, String dob) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.dob = dob;
		this.adress = adress;
		this.phone = phone;
	}
	public Employee(){
		
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
