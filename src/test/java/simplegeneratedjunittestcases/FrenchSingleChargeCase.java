package simplegeneratedjunittestcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrenchSingleChargeCase {
	
	private static String chargeReference;
	private static double chargeAmount;
	private static FrenchChargingImplementation myFrenchCI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		chargeAmount  = 45.00;
		chargeReference = "Vive La France";
		myFrenchCI = new FrenchChargingImplementation(chargeReference,chargeAmount);
		System.out.println("Re-created");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetChargeReference() {
		myFrenchCI.setChargeReference("Allez Les Blues");
		assertEquals("Allez Les Blues In Euros 45.0",myFrenchCI.getChargeDetails());
	}

	@Test
	public void testCancelCharge() {
		myFrenchCI.cancelCharge();
		assertEquals("Allez Les Blues In Euros 0.0",myFrenchCI.getChargeDetails());
	}

	@Test
	public void testChargeManipulations() {
		myFrenchCI.cancelCharge();
		myFrenchCI.incrementChargeAmount(10.00);
		assertEquals("Allez Les Blues In Euros 10.0",myFrenchCI.getChargeDetails());
		myFrenchCI.incrementChargeAmount(10.00);
		assertEquals("Allez Les Blues In Euros 20.0",myFrenchCI.getChargeDetails());
		myFrenchCI.decrementChargeAmount(10.00);
		assertEquals("Allez Les Blues In Euros 10.0",myFrenchCI.getChargeDetails());
	}
}
