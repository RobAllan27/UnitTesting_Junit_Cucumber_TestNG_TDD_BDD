package simplegeneratedjunittestcases;

/** An implementation for the charging interface for an French Charge.
 * 
 *  In this case, the implementations do have concrete implementation,
 *  as opposed to default interface implementation  
 * 
 * @author Rob
 *
 */

public class FrenchChargingImplementation implements chargingInterface {

	private String chargeReference;
	private double chargeAmount;
	
	
	/** A constructor to allow a charge reference to be defined.
	 * @param inReference - a string reference
	 * @param inchargeAmount - a charge amount
	 */
	public FrenchChargingImplementation(String inReference, double inchargeAmount) {
		this.chargeReference = inReference;
		this.chargeAmount = inchargeAmount;
	} 
	
	/** A simple interface to set the charge reference as string
	 * @see simplegeneratedjunittestcases.chargingInterface#setChargeReference(java.lang.String)
	 */
	public String setChargeReference(String inReference) {
		this.chargeReference = inReference;
		return null;
	}
		
	/** An interface to get the charge details
	 * @return a string of the charge details
	 */
	public String getChargeDetails() {
		String chargeDetails = this.chargeReference + " In Euros " + this.chargeAmount;
		return chargeDetails;
	}

	/** An implementation to cancel the charge
	 * @see simplegeneratedjunittestcases.chargingInterface#cancelCharge()
	 */
	public String cancelCharge() {
		this.chargeAmount = 0;
		return null;
	}

	/**  An implementation to decrement the charge amount 
	 * @see simplegeneratedjunittestcases.chargingInterface#decrementChargeAmount(double)
	 */	
	public void decrementChargeAmount(double inAmount) {
		this.chargeAmount -= inAmount;
		//System.out.println(this.chargeAmount);
	}

	/** An implementation to add the charge amount 
	 * @see simplegeneratedjunittestcases.chargingInterface#incrementChargeAmount(double)
	 */
	public void incrementChargeAmount(double inAmount) {
		// TODO Auto-generated method stub
		this.chargeAmount += inAmount;
	}
}
