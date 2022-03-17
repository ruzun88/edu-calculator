package com.sk.tdd.hello;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test() {
		Date date = new Date();
		Class<? extends Date> class1 = date.getClass();
		String name = class1.getName();
		assertEquals("java.util.Date", name);
	}
	
	@Test
	public void testTimestamp() {
		assertTrue(new Date().getTime() > 16473019183L);
	}
	
	@Test
	public void test2() {
		assertTrue(true);
	}

}
