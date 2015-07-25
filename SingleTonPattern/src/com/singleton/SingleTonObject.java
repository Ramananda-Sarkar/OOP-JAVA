package com.singleton;

public class SingleTonObject {
	private String name;
	private String email;
	private String address;

	private static SingleTonObject instance;

	private SingleTonObject(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public static SingleTonObject getInatance(String name, String email,
			String address) {
		if (instance == null) {
			instance = new SingleTonObject(name, email, address);
		}
		return instance;
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

}
