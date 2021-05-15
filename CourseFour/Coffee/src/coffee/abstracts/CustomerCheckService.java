package coffee.abstracts;

import coffee.entities.Customer;

public interface CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer);
}
