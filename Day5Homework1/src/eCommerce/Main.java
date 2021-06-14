package eCommerce;

import java.util.ArrayList;
import java.util.Scanner;

import eCommerce.GoogleAuthManager.GoogleAuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.googleAuthManagerAdapter.GoogleAuthManagerAdapter;
import eCommerce.dataAccsess.concretes.MyUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Giriþ yap \n2 - Kayýt Ol");
		
		System.out.println("Yapmak istediðin iþlemi seç!");
		
		int selection = scanner.nextInt();
		if(selection == 1) {
			
			
			System.out.println("1 - Google \n2 - Mail & Password");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Hangisiyle giriþ yapacaksýn? ");
			int selection2 = sc.nextInt();
			
			if(selection2 == 1) {
				User user = new User();
				user.seteMail("mccankaya45@hotmail.com");
				User user2 = new User();
				user2.seteMail("mccankaya45@hotmail.com");
				user2.setPassword("123456");
				
				UserManager userManager = new UserManager(new GoogleAuthManagerAdapter(new GoogleAuthManager()));
				userManager.login(user);
				userManager.login(user2);
			}else if(selection2 == 2) {
				User user = new User();
				user.seteMail("cakmakkadriye45@gmail.com");
				User user2 = new User();
				user2.seteMail("cakmakkadriye45@gmail.com");
				user2.setPassword("123456");
				
				ArrayList<User> users = new ArrayList<>();
				UserManager userManager = new UserManager(new MyUserDao(users));
				userManager.login(user);
				userManager.login(user2);
			}
		}
		else if(selection == 2) {
			
			ArrayList<User> users = new ArrayList<>();
			UserManager userManager = new UserManager(new MyUserDao(users));
			User user = new User(1,"Can","ymg","mccankaya45@hotmail.com","1234567");
			User user2 = new User(2, "mert", "ymg", "mccankaya451@hotmail.com", "123456");
			userManager.register(user);
			userManager.register(user2);
		}

	}

}
