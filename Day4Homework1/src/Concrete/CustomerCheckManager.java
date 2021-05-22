package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		return true;
		
		
	}

}
