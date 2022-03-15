package com.sk.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sk.tdd.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3,  result);
	}

	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.minus(2, 1);
		assertEquals(1,  result);
	}

	@Test
	public void testMuliply() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(2, 3);
		assertEquals(6,  result);
	}

	@Test
	public void testDevide() {
		Calculator calculator = new Calculator();
		int result = calculator.devide(6, 3);
		assertEquals(2,  result);
	}

}
