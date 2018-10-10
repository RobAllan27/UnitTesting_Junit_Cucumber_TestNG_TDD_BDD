package simplegeneratedjunittestcases;

/** A simple interface that the chargingInterface should support for charge a charge, 
 * setting its reference, canceling a charge and getting its charge reference. 
 * @author Rob
 *
 */
public interface chargingInterface {
	
	
	/** Interface defined to increment the charge Amount for a single charge
	 * @param inAmount The amount to increment a charge by.
	 */
	public void incrementChargeAmount(double inAmount);
	
	/** Interface defined to decrement the charge Amount for a single charge
	 * @param inAmount The amount to decrement a charge by.
	 */
	public void decrementChargeAmount(double inAmount);
	
	/** Interface defined to set a string for a charge - e.g. give it a textual name 
	 * @param inReference A string reference for the Charge amount.
	 * @return Return a Charge Reference 
	 */
	public String setChargeReference(String inReference);
	
	/** Interface defined to reset the charge Amount for a single charge
	 * @return a String to describe the charge
	 */
	public String cancelCharge();
}
