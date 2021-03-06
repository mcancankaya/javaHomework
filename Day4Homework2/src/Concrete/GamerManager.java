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
		System.out.println("Kullanıcı eklendi : "+ gamer.getFirstName());
		
		}else {
			System.out.println("Kullanıcı Doğrulanamadı...");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanıcı Silindi : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanıcı Güncellendi : "+ gamer.getFirstName());
		
	}

	


}
