package testDrivenDevelopment;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

//import java.util.List;

public class CustomerServiceImplTest {

	CustomerServiceImplementation customerService = new CustomerServiceImplementation();
	
	/*
	 * 
	 * The following methods exist in the interface
	 * 		public Customer createNewCustomer(Customer customer);
	 * 		public Customer updateCustomer(Customer customer);
	 * 		public boolean removeCustomer(Customer customer);
	 * 		public List<Transaction> listAllTransactions(Customer customer);
	 * 
	 */
	
	/**
	 * Test method for {@link com.areyes1.jgc.svc.AccountServiceImpl#createNewAccount(com.areyes1.jgc.obj.Account)}.
	 */	

	@Test
	public void testCreateNewCustomer() {
		Customer newCustomer = new Customer();
		newCustomer.setName("Rob");
		newCustomer.setDescription("This is the description of Rob");
		newCustomer.setTitle("Mr");
		
		Customer newCustomerInserted = customerService.createNewCustomer(newCustomer);
		
		//	Check if the account has the same composition.
		assertThat(newCustomer, isA(Customer.class));
		assertEquals(newCustomer.getName(), newCustomerInserted.getName());
		assertEquals(newCustomer.getDescription(), newCustomerInserted.getDescription());
		assertEquals(newCustomer.getTitle(), newCustomerInserted.getTitle());

	}

	/**
	 * Test method for {@link com.areyes1.jgc.svc.AccountServiceImpl#updateAccount(com.areyes1.jgc.obj.Account)}.
	 */
	@Test
	public void testUpdateAccount() {
		
		
		//	The old account (assumed that this came from a database or mock)
		Customer oldCustomer = new Customer();
		oldCustomer.setName("Rob Allan");
		oldCustomer.setDescription("This is the description");
		
		String oldCustomerName = oldCustomer.getName();
		//	Check if the account is still the same. it is expected to be different since we updated it.
		Customer newerCustomer =  new Customer();
		newerCustomer = customerService.updateCustomer(oldCustomer);
		assertThat(newerCustomer, isA(Customer.class));
		assertNotEquals(oldCustomerName, newerCustomer.getName());
	}

	/**
	 * Test method for {@link com.areyes1.jgc.svc.AccountServiceImpl#removeAccount(com.areyes1.jgc.obj.Account)}.
	 */
	@Test
	public void testRemoveAccount() {
		
		//	Set up the account to be removed.
		Customer toBeRemovedCustomer = new Customer();
		toBeRemovedCustomer.setName("Rob Allan");
		toBeRemovedCustomer.setDescription("This is the description for the to be removed customer");
		
		//	Removed the account.
		assertTrue(customerService.removeCustomer(toBeRemovedCustomer));
	}

	/**
	 * Test method for {@link com.areyes1.jgc.svc.AccountServiceImpl#listAllTransactions(com.areyes1.jgc.obj.Account)}.
	 */
	@Test
	public void testListAllTransactions() {
		
		Customer customer = new Customer();
		customer.setName("Rob Allan");
		
		//	Service gets all transaction
		customerService.listAllTransactions(customer);
		
		//	Check if there are transactions.
	
		assertTrue(customerService.listAllTransactions(customer).size() > 1);
	
	}

}