package testDrivenDevelopment;

import java.util.List;

public interface CustomerService {

  public Customer createNewCustomer(Customer customer);

  public Customer updateCustomer(Customer customer);

  public boolean removeCustomer(Customer customer);

  public List<Transaction> listAllTransactions(Customer customer);

}