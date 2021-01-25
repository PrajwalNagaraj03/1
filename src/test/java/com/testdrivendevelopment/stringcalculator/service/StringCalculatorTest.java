package com.testdrivendevelopment.stringcalculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class StringCalculatorTest {

	@Test
	@Order(1)
	void test() {
		// StringCalculator calculator = new StringCalculator();
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	@Order(2)
	void emptyCheck() {
		assertEquals(0, StringCalculator.add(" "));
	}

	@Test
	@Order(3)
	void nullCheck() {
		assertNull(StringCalculator.add(null));
	}

	@Test
	@Order(4)
	void checkOneNumber() {
		assertEquals(9, StringCalculator.add("9"));
	}

	@Test
	@Order(5)
	void simpleInputs() {
		assertEquals(6, StringCalculator.add("1,2,3"));
		// assertEquals(9, StringCalculator.add("//;\\n1,2,3"));
		// assertEquals(9, StringCalculator.add("-11,-2,3"));
	}

	@Test
	@Order(6)
	void handleNewLines() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Test 
	@Order(7)
	void handleNewDelimeters() {
		assertEquals(3, StringCalculator.add("//;\\n1;2"));
	}
	
	@Test
	@Order(8)
	void customDelimeters() {
		assertEquals(27, StringCalculator.add("//;\\n1;2;3;5;7;9"));
	}
	
	@Test
	@Order(9)
	void negativeNumbers() {
		try {
			StringCalculator.add("-1,-3,3");
		} catch(IllegalArgumentException e) {
			assertEquals("Negative Numbers are not allowed -1,-3", e.getMessage());
		}
	}
	
	@Test
	@Order(10)
	void testWithLetters() {
		try {
			StringCalculator.add("a,b,c");
		} catch(NumberFormatException e) {
			assertEquals("Letters are not allowed", e.getMessage());
		}
	}
	
	@Test
	@Order(11)
	void invokeCountMethod() {
		StringCalculator.noOfTimesMethodInvoked();
	}
}
