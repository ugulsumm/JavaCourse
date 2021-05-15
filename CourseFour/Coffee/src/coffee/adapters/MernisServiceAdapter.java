package coffee.adapters;

import coffee.abstracts.CustomerCheckService;
import coffee.entities.Customer;
import coffee.mernis.Mernis;

public class MernisServiceAdapter implements CustomerCheckService{

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		Mernis mernis = new Mernis();
		return mernis.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());		
	}

}
