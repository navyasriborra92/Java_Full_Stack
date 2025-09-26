package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ResidentDetails")
public class ResidentDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int residentId;

    @Column(name = "residentusername", unique = true, nullable = false)
    private String residentusername;
	
	private String name;
	
	private int age;

	private String blockName;
	
	private int FlatNo;
	
	private String role;
	
	private String password;

	public ResidentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResidentDetails(String residentusername, String name, int age, String blockName, int flatNo, String role,
			String password) {
		super();
		this.residentusername = residentusername;
		this.name = name;
		this.age = age;
		this.blockName = blockName;
		FlatNo = flatNo;
		this.role = role;
		this.password = password;
	}

	public ResidentDetails(String username, String password2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResidentDetails [residentusername=" + residentusername + ", name=" + name + ", age=" + age
				+ ", blockName=" + blockName + ", FlatNo=" + FlatNo + ", role=" + role + ", password=" + password + "]";
	}

	public String getResidentusername() {
		return residentusername;
	}

	public void setResidentusername(String residentusername) {
		this.residentusername = residentusername;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public int getFlatNo() {
		return FlatNo;
	}

	public void setFlatNo(int flatNo) {
		FlatNo = flatNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}