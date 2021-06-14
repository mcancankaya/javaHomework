package eCommerce.dataAccsess.concretes;

import java.util.ArrayList;

import eCommerce.dataAccsess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class MyUserDao implements UserDao{
	private ArrayList<User>users;
	
	public MyUserDao(ArrayList<User>users) {
		this.users=users;
	}
	@Override
	public void login(User user) {
		System.out.println("Kullanýcý Giriþi baþarýlý. : "+user.geteMail());
		
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý MyUserDao ile eklendi : "+user.geteMail());
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý MyUserDao ile Silindi : "+user.geteMail());
	}

	@Override
	public User getByMail(String mail) {
		for(User user:users){
			if(user.geteMail().equals(mail)) {
				return user;
			}
		}
		return null;
	}

	

}
