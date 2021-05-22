package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		boolean result=false;
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());	
		}
		catch (Exception e){
			System.out.println("Not a valid person");
		}
		
		return result;
	}
	
}
