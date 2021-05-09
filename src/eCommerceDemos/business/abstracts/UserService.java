package eCommerceDemos.business.abstracts;

import eCommerceDemos.entities.concretes.User;

public interface UserService {

	void userRegister(User user);

	void userLogIn(String eMail, String password);

}
