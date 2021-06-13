package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {
	public IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println("Kullanýcý eklendi : "+ gamer.getFirstName());
		
		}else {
			System.out.println("Kullanýcý Doðrulanamadý...");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý Silindi : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý Güncellendi : "+ gamer.getFirstName());
		
	}

	


}
