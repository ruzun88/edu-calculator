package com.sk.tdd;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sk.tdd.calculator.CalculatorTest;
import com.sk.tdd.hello.HelloWorldTest;
import com.sk.tdd.hello.StringUtils;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class,
	HelloWorldTest.class})
public class AllTests {

}
