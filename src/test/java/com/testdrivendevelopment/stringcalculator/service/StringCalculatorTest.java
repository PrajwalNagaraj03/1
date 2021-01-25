package com.testdrivendevelopment.stringcalculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test() {
		// StringCalculator calculator = new StringCalculator();
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

	@Test
	void checkOneNumber() {
		assertEquals(9, StringCalculator.add("9"));
	}

	@Test
	void simpleInputs() {
		assertEquals(6, StringCalculator.add("1,2,3"));
		// assertEquals(9, StringCalculator.add("//;\\n1,2,3"));
		// assertEquals(9, StringCalculator.add("-11,-2,3"));
	}

	@Test
	void handleNewLines() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Test 
	void handleNewDelimeters() {
		assertEquals(3, StringCalculator.add("//;\\n1;2"));
	}

}
