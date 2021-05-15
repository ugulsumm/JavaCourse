package coffee.concretes;

import coffee.abstracts.BaseCustomerManager;
import coffee.abstracts.CustomerCheckService;
import coffee.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	//@Override   implements CustomerCheckService
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid user.");
		}
		
		
	}
	

	/*public void CheckIfPerson(Customer customer) {
		
	}*/

}
