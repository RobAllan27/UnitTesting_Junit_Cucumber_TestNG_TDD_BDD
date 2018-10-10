package testDrivenDevelopment;

import java.util.List;

/** Defined interface to state the method that the customer service interface has to support.
 * @author Rob
 *
 */
public interface CustomerService {

	
  /** An interface to return a basic customer 
 * @param customer
 * @return the created customer
 */
public Customer createNewCustomer(Customer customer);

  /** An interface to update a customer
 * @param customer - create a new customer at the interface
 * @return the updated customer
 */
public Customer updateCustomer(Customer customer);

  /** A method to delete a customer
 * @param customer - the customer being deleted
 * @return a boolean to indicate the customer has been deleted
 */
public boolean removeCustomer(Customer customer);

  /** A way to list the transactions against a customer.
 * @param customer - the customer that we want to delete.
 * @return -  return a list of the transactions for that customer.
 */
public List<Transaction> listAllTransactions(Customer customer);

}