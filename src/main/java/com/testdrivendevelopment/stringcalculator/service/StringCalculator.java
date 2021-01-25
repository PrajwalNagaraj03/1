package com.testdrivendevelopment.stringcalculator.service;

public class StringCalculator {

	public Integer add(String input) {
		String[] numbers = input.split(",");
		int sum = 0;
		for (String number : numbers) {
			sum = sum+Integer.valueOf(number);
		}
		return sum;
	}

}
