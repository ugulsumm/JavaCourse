package coffee;

import java.util.Date;

import coffee.abstracts.BaseCustomerManager;
import coffee.abstracts.CustomerCheckService;
import coffee.adapters.MernisServiceAdapter;
import coffee.concretes.NeroCustomerManager;
import coffee.concretes.StarbucksCustomerManager;
import coffee.entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		
		customer.setDateOfBirth(new Date(1990,11,12));customer.setFirstName("gulsum");customer.setId(1);customer.setLastName("taban");customer.setNationalityId("11111111111");
		customerManager.save(customer);
		
		MernisServiceAdapter mernisServiceAdapter= new MernisServiceAdapter(); 
		if(mernisServiceAdapter.CheckIfRealPerson(customer)) {
			System.out.println("Person is real.");
		}else {
			System.out.println("Person is unreal.");
		}
		
	}

}
