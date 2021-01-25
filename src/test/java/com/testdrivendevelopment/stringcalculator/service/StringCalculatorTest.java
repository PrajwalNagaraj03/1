package com.testdrivendevelopment.stringcalculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("1,2"));
	}

}
