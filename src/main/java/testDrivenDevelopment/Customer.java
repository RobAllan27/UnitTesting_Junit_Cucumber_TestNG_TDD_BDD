package testDrivenDevelopment;

import java.util.List;

/** A POJO class holding customer details with getters and setters for
 *  - name
 *  - description
 *  - title
 *  - a list of transactions
 * @author Rob
 *
 */
public class Customer {

	public String name;

	public String description;

	public String title; 
	
	public List<Transaction> transactions;

	/** A getter for the customer name
	 * @return the name of the customer
	 */
	public String getName() {
		return name;
	}

	/** A set operation to set the name for a customer
	 * @param name - the name of the customer
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** A getter for the customer description.
	 * @return the description of the customer.
	 */
	public String getDescription() {
		return description;
	}

	/** A setter for the customer description
	 * @param description - a textual description for the customer
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/** A getter for the title for the customer.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/** A setter for the title for the customer.
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/** A getter for the customer transactions
	 * @return a list of the customer transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/** Setter for the customer transactions
	 * @param transactions a list of transactions for the customer
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}