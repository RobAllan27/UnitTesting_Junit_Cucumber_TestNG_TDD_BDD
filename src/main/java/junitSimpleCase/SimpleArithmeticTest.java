package junitSimpleCase;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleArithmeticTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	// First test case
	
	@Before
	public void before1() {
		System.out.println("Before 1st Test Case");
	}
	@Test
	public void isLargerTest() {
		System.out.println("Test");
		SimpleArithmetic helloWorld = new SimpleArithmetic();
		assertTrue("Number 1 is greater than Number 2", helloWorld.isLarger(4, 3));
	}
	@After
	public void after1() {
		System.out.println("After 1st Test Case");
	}
	
	
	// Second test case
	
	@Before
	public void before2() {
		System.out.println("Before 1st Test Case");
	}
	@Test
	public void isSmallerTest() {
		System.out.println("Test");
		SimpleArithmetic helloWorld = new SimpleArithmetic();
		assertTrue("Number 1 is greater than Number 2", helloWorld.isSmaller(3, 4));
	}
	@After
	public void after2() {
		System.out.println("After 2nd Test Case");
	}
	
	
	// Third test case
	
	@Before
	public void before3() {
		System.out.println("Before 3rd Test Case");
	}
	@Test
	public void isEqual1Test() {
		System.out.println("Test");
		SimpleArithmetic helloWorld = new SimpleArithmetic();
		assertTrue("Number 1 is greater than Number 2", helloWorld.isEqual(3, 3));
	}
	@After
	public void after3() {
		System.out.println("After 3rd Test Case");
	}
	
	
	// Fourth test case
	
	@Before
	public void before4() {
		System.out.println("Before 4th Test Case");
	}
	@Test
	public void isEqual2Test() {
		System.out.println("Test");
		SimpleArithmetic helloWorld = new SimpleArithmetic();
		assertTrue("Number 1 is greater than Number 2", helloWorld.isEqual(4, 4));
	}
	@After
	public void after4() {
		System.out.println("After 4th Test Case");
	}
	
	// Fifth test case
	
	@Before
	public void before5() {
		System.out.println("Before 5th Test Case");
	}
	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		SimpleArithmetic helloWorld = new SimpleArithmetic();
		assertTrue("Number 1 is greater than Number 2", helloWorld.isEqual(4, 3));
	}
	@After
	public void after5() {
		System.out.println("After 5th Test Case");
	}
	
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}