package coffee.concretes;

import coffee.abstracts.CustomerCheckService;
import coffee.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub
		
	}



}
