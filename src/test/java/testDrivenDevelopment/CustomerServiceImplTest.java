package testDrivenDevelopment;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

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
	 * Test method to create new Customer.
	 */	

	@Test
	public void testCreateNewCustomer(){
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
	 * Test method to update an account
	 */
	@Test
	public void testUpdateAccountAndAccountsNotLinked(){
		
		
		//	The old account (assumed that this came from a database or mock)
		Customer oldCustomer = new Customer();
		oldCustomer.setName("Snr Rob Allan");
		oldCustomer.setDescription("This is the description");
		
		String oldCustomerName = oldCustomer.getName();
		//	Check if the account is still the same. it is expected to be different since we updated it.
		Customer newerCustomer =  new Customer();
		customerService.updateCustomer(oldCustomer);
		// should just be Rob Allan
		assertEquals(oldCustomer.getName(),"Rob Allan");
		newerCustomer.setName("Bill Brice");
		assertThat(newerCustomer, isA(Customer.class));
		assertNotEquals(oldCustomerName, newerCustomer.getName());
	}

	/**
	 * Test method to remove an account
	 */
	@Test
	public void testRemoveAccount(){
		
		//	Set up the account to be removed.
		Customer toBeRemovedCustomer = new Customer();
		toBeRemovedCustomer.setName("Rob Allan");
		toBeRemovedCustomer.setDescription("This is the description for the to be removed customer");
		
		//	Removed the account.
		assertTrue(customerService.removeCustomer(toBeRemovedCustomer));
	}

	/**
	 * Test method for to list all the transactions against an account
	 */
	@Test
	public void simpleTestListAllTransactions(){
		
		Customer customer = new Customer();
		customer.setName("Rob Allan");
		
		//	Service gets all transaction
		customerService.listAllTransactions(customer);
		
		//	Check if there are transactions.
	
		assertTrue(customerService.listAllTransactions(customer).size() > 1);
	
	}

	@Test
	public void detailedTestListAllTransactions(){
		
		Customer customer = new Customer();
		customer.setName("Rob Allan");
		
		//	Service gets all transaction
		customerService.listAllTransactions(customer);
		
		//	Check if there are transactions.
	
		//customerService.listAllTransactions(inCustomer)
		/*
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
		*/
		
		List<Transaction> transactionsToCheck = customerService.listAllTransactions(customer).stream()
				.filter( transaction -> transaction.getId() == 45).
				collect(Collectors.toList());
		
		assertEquals(transactionsToCheck.get(0).getType(),"basic1type");
	
		transactionsToCheck = customerService.listAllTransactions(customer).stream()
				.filter( transaction -> transaction.getId() == 46).
				collect(Collectors.toList());
		
		assertEquals(transactionsToCheck.get(0).getType(),"basic2type");
		
		transactionsToCheck = customerService.listAllTransactions(customer).stream()
				.filter( transaction -> transaction.getId() == 47).
				collect(Collectors.toList());
		
		assertEquals(transactionsToCheck.get(0).getType(),"basic3type");
	}
}