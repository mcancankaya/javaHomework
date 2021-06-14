package eCommerce.dataAccsess.abstracts;


import eCommerce.entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
	void delete(User user);
	
	User getByMail(String mail);
}
