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
	
	@Test
	void customDelimeters() {
		assertEquals(27, StringCalculator.add("//;\\n1;2;3;5;7;9"));
	}
	
	@Test
	void negativeNumbers() {
		try {
			StringCalculator.add("-1,-3,3");
		} catch(IllegalArgumentException e) {
			assertEquals("Negative Numbers are not allowed -1,-3", e.getMessage());
		}
	}
	
	@Test
	void testWithLetters() {
		try {
			StringCalculator.add("a,b,c");
		} catch(NumberFormatException e) {
			assertEquals("Letters are not allowed", e.getMessage());
		}
	}
	
	@Test
	void invokeCountMethod() {
		StringCalculator.noOfTimesMethodInvoked();
	}
}
