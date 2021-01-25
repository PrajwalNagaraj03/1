package com.testdrivendevelopment.stringcalculator.service;

public class StringCalculator {

	public static Integer add(String input) {
		String delimeter = ",|\n";
		
		String numberWithoutNewDelimeter = new String(input);
		
		if(input == null) {
			return null;
		}
		
		if(" ".equals(input) || "".equals(input)) {
			return 0;
		}
		
		if(input.startsWith("//")) {
			int indexOfDelimeter = input.indexOf("//") + 2;
			//delimeter = ; position 3
			delimeter = input.substring(indexOfDelimeter +1);
			numberWithoutNewDelimeter = input.substring(input.indexOf("n")+1);
		}
		
		String[] numbers = numberWithoutNewDelimeter.split(delimeter);
		int sum = 0;
		for (String number : numbers) {
			if(number != null && !number.trim().isEmpty()) {
				sum = sum+Integer.valueOf(number.trim());
			}
		}
		return sum;
	}

}
