package eCommerce.GoogleAuthManager;

import eCommerce.entities.concretes.User;

public class GoogleAuthManager {
	public void gRegister(User user) {
		System.out.println("Kullan�c� Google �le kay�t oldu. : "+user.getFirstName()+" "+user.getLastName());
	}
	public void gLogin(User user) {
		System.out.println("Kullan�c� Google �le giri� yapt�. : "+user.getFirstName()+" "+user.getLastName());
	}
}
