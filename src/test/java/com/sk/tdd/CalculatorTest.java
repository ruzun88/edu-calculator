package com.sk.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3,  result);
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMuliply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDevide() {
		fail("Not yet implemented");
	}

}