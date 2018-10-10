package testDrivenDevelopment;

//public class Transaction extends Customer

public class Transaction {

	  public Integer id;

	  public Float amount;

	  public String type;
	  
	  public String description;

	/** A getter for the transaction id
	 * @return the id for the transaction
	 */
	public Integer getId() {
		return id;
	}

	/** A setter for the id for the transaction 
	 * @param id - the id to set for the transaction
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** A getter to get the amount of a transaction
	 * @return the amount for the transaction
	 */
	public Float getAmount() {
		return amount;
	}

	/** A setter to define the amount for a transaction 
	 * @param amount - the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/** A getter to obtain the type of a transaction
	 * @return the type of the transaction
	 */
	public String getType() {
		return type;
	}

	/** A setter for the transaction type.
	 * @param type - the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** A getter for a description of a transactions
	 * @return the description of the transaction
	 */
	public String getDescription() {
		return description;
	}

	/** A setter for the description of the transaction
	 * @param description - the description to set for the transaction
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	 
	}