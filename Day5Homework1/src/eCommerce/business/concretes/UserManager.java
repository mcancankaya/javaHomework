package eCommerce.business.concretes;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.authService.AuthService;
import eCommerce.dataAccsess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao dao;
	private AuthService authService;
	
	public UserManager(UserDao dao) {
		super();
		this.dao = dao;
	}

	public UserManager(AuthService authService) {
		super();
		this.authService = authService;
	}
	

	@Override
	public void register(User user) {
		
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r..");
			return;
		}
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(!matcher.matches()) {
			System.out.println("E-Posta Adresinizi do�ru giriniz..");
			return;
		}
		
		if (dao.getByMail(user.geteMail()) != null){
	        System.out.println("E-Posta daha �nce kullan�lm��..");
	        return;
	    }
		
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ad�n�z ve Soyad�n�z minimum 2 Karakterden olu�mal�d�r..");
			return;
		}
		
		dao.register(user);
		
	}

	@Override
	public void login(User user) {
		if (user.geteMail() == null || user.getPassword() == null) {
			System.out.println("E-Posta veya �ifreyi bo� b�rakmay�n�z...");
			return;
		}
		if(dao != null) {
			dao.login(user);
		}
		if(authService != null) {
		    authService.login(user);
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
