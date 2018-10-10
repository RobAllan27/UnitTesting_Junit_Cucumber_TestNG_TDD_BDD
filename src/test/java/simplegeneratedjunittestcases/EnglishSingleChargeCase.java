package simplegeneratedjunittestcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnglishSingleChargeCase {
	
	private static String chargeReference;
	private static double chargeAmount;
	private static EnglishChargingImplementation myEnglishCI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		chargeAmount  = 45.00;
		chargeReference = "Rule Britannia";
		myEnglishCI = new EnglishChargingImplementation(chargeReference,chargeAmount);
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
		myEnglishCI.setChargeReference("You'll Never Walk Alone");
		assertEquals("You'll Never Walk Alone In Pounds 45.0",myEnglishCI.getChargeDetails());
	}

	@Test
	public void testCancelCharge() {
		myEnglishCI.cancelCharge();
		assertEquals("You'll Never Walk Alone In Pounds 0.0",myEnglishCI.getChargeDetails());
	}

	@Test
	public void testChargeManipulations() {
		myEnglishCI.cancelCharge();
		myEnglishCI.incrementChargeAmount(10.00);
		assertEquals("You'll Never Walk Alone In Pounds 10.0",myEnglishCI.getChargeDetails());
		myEnglishCI.incrementChargeAmount(10.00);
		assertEquals("You'll Never Walk Alone In Pounds 20.0",myEnglishCI.getChargeDetails());
		myEnglishCI.decrementChargeAmount(10.00);
		assertEquals("You'll Never Walk Alone In Pounds 10.0",myEnglishCI.getChargeDetails());
	}
	
}
