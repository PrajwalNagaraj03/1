package com.testdrivendevelopment.stringcalculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test() {
		//StringCalculator calculator = new StringCalculator();
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
	void emptyCheck() {
		assertEquals(0, StringCalculator.add(" "));
	}
	
	@Test
	void nullCheck() {
		assertNull(StringCalculator.add(null));
	}

}
