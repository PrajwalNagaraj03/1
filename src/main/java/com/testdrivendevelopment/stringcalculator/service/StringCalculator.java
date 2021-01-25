package com.testdrivendevelopment.stringcalculator.service;

public class StringCalculator {

	public static Integer add(String input) {
		
		if(input == null) {
			return null;
		}
		
		if(" ".equals(input) || "".equals(input)) {
			return 0;
		}
		
		String[] numbers = input.split(",");
		int sum = 0;
		for (String number : numbers) {
			sum = sum+Integer.valueOf(number);
		}
		return sum;
	}

}
