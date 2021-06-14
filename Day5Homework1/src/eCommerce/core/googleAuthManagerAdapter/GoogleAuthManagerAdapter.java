package eCommerce.core.googleAuthManagerAdapter;

import eCommerce.GoogleAuthManager.GoogleAuthManager;
import eCommerce.core.authService.AuthService;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {
	
	private GoogleAuthManager googleAuthManager;
	
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void register(User user) {
		googleAuthManager.gRegister(user);
	}

	@Override
	public void login(User user) {
		
		googleAuthManager.gLogin(user);
	}

}
