package testDrivenDevelopment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rob
 * A basic customer service implementation of the customer service interface
 */

public class CustomerServiceImplementation implements CustomerService {
	public Customer createNewCustomer(Customer inCustomer) {
		// real implementation will insert data to database.
		return inCustomer;
		
	}	

	/**
	 * A method to allow a customer to be updated. 
	 * In this case a simple implementation to update the name
	 * @return a reference to the updated customer
	 */
	public Customer updateCustomer(Customer inCustomer) {
		// real implementation would update the customer
		inCustomer.setName("Rob Allan");
		return inCustomer;
	}

	
	/**
	 * @return a boolean to indicate that the customer had been deleted
	 */
	public boolean removeCustomer(Customer inCustomer) {
		//	real implementation would delete the customer
		return true;	
	}
	
	/** This method returns a notional set of transactions for a customer
	 * @return a set of transactions for a customer.
	 * 
	*/
	public List<Transaction> listAllTransactions(Customer inCustomer) {
		// real implementation would get data from a database
		List<Transaction> listOfAllTransactions = new ArrayList<Transaction>();
		Transaction trans1 = new Transaction();
		Transaction trans2 = new Transaction();
		Transaction trans3 = new Transaction();
		trans1.setAmount(12.12f);
		trans1.setDescription("transaction1");
		trans1.setId(45);
		trans1.setType("basic1type");
		trans2.setAmount(12.12f);
		trans2.setDescription("transaction2");
		trans2.setId(46);
		trans2.setType("basic2type");
		trans3.setAmount(12.12f);
		trans3.setDescription("transaction3");
		trans3.setId(47);
		trans3.setType("basic3type");
		listOfAllTransactions.add(trans1);
		listOfAllTransactions.add(trans2);
		listOfAllTransactions.add(trans3);
		inCustomer.setTransactions(listOfAllTransactions);
		
		return listOfAllTransactions;
	}
}

