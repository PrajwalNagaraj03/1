package com.testdrivendevelopment.stringcalculator.service;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static Integer add(String input) {
		String delimeter = ",|\n";

		if (input == null) {
			return null;
		}

		if (" ".equals(input) || "".equals(input)) {
			return 0;
		}

		String numberWithoutNewDelimeter = new String(input);

		if (input.startsWith("//")) {
			int indexOfDelimeter = input.indexOf("//") + 2;
			// delimeter = ; position 3
			delimeter = input.substring(indexOfDelimeter, indexOfDelimeter + 1);
			numberWithoutNewDelimeter = input.substring(input.indexOf("n") + 1);
		}
		String[] numbers = numberWithoutNewDelimeter.split(delimeter);

		return addNumbers(numbers);
	}

	private static Integer addNumbers(String[] numbers) {
		int sum = 0;
		
		List<String> negativeNumbers = new ArrayList<>();
		try {
			for (String number : numbers) {
				if (number != null && !number.trim().isEmpty()) {
					
					int num = Integer.valueOf(number.trim());
					
					if (num < 0) {
						negativeNumbers.add(number.trim());	
					}
					
					sum = sum + Integer.valueOf(number.trim());
				}
			}
			
			if (!negativeNumbers.isEmpty()) {
				throw new IllegalArgumentException("Negative Numbers are not allowed " + String.join(",", negativeNumbers));
			}
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Letters are not allowed");
		}
		
		
		return sum;
	}

}
