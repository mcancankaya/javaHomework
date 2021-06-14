package eCommerce.GoogleAuthManager;

import eCommerce.entities.concretes.User;

public class GoogleAuthManager {
	public void gRegister(User user) {
		System.out.println("Kullanýcý Google Ýle kayýt oldu. : "+user.getFirstName()+" "+user.getLastName());
	}
	public void gLogin(User user) {
		System.out.println("Kullanýcý Google Ýle giriþ yaptý. : "+user.getFirstName()+" "+user.getLastName());
	}
}
