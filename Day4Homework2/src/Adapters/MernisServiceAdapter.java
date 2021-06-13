package Adapters;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {
	
	boolean result;
	
	public boolean checkIfRealPerson(Gamer gamer) {
		
		
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		try {
			result = proxy.TCKimlikNoDogrula(gamer.getNationalityId(),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());	
		}
		catch (Exception e){
			System.out.println("Doðrulanmýþ Kullanýcý deðil...");
		}
		return result;
		
		
}
}