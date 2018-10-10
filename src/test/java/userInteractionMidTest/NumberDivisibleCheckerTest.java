package userInteractionMidTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class NumberDivisibleCheckerTest {

	private static NumberDivisibleChecker numberDivisibleChecker;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numberDivisibleChecker = new NumberDivisibleChecker();
	}
	
	@Test
	public void testNumberIsNotDivisibleby2() {		
		System.out.print("Enter a number not divisible by 2\n");		
		int numberToCheck = promptForValue();		
		assertTrue(numberDivisibleChecker.numberIsNotDivisibleby2(numberToCheck));
	}
	
	@Test
	public void testNumberIsNotDivisibleby3() {		
		System.out.print("Enter a number not divisible by 3\n");		
		int numberToCheck = promptForValue();		
		assertTrue(numberDivisibleChecker.numberIsNotDivisibleby3(numberToCheck));
	}
	
	@Test
	public void testNumberIsNotDivisibleby5() {		
		System.out.print("Enter a number not divisible by 5\n");		
		int numberToCheck = promptForValue();		
		assertTrue(numberDivisibleChecker.numberIsNotDivisibleby5(numberToCheck));
	}
	
	@Test
	public void testNumberIsNotDivisibleby2or3or5() {		
		System.out.print("Enter a number not divisible by 2 or 3 or 5\n");		
		int numberToCheck = promptForValue();		
		assertTrue(numberDivisibleChecker.numberIsNotDivisibleby2(numberToCheck));
	}
	
	private int promptForValue(){
		String valueObtained = "123";
		int numberObtained = 0;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			valueObtained = reader.readLine();
			numberObtained  = Integer.parseInt(valueObtained);
		} catch (Exception e) {	
		}
		return numberObtained;
	}
	
}
