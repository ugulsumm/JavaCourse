package coffee.abstracts;

import coffee.entities.Customer;

public abstract class BaseCustomerManager{
	public void save(Customer customer) {
		System.out.println("Saved to db"+customer.getFirstName());
	}
}
