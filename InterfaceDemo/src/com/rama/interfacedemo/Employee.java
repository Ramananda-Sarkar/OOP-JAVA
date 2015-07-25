package com.rama.interfacedemo;

public class Employee implements Information {
	private String name;
	private String email;
	private String address;

	public Employee(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void getInfomation() {
		System.out.println(" Name :" + getName());
		System.out.println(" Email :" + getEmail());
		System.out.println(" Address :" + getAddress());
		System.out.println("-----------------");
	}

}
