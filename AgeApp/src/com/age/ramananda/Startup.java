package com.age.ramananda;

public class Startup {
	public static void main(String[] args) {
		CalculateAge cal1 = new CalculateAge();
		cal1.getCurrentAge();
		
		cal1.calculate();
		cal1.showResult();
		cal1.setAge(12);
	}
}
