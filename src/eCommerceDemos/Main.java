package eCommerceDemos;

import eCommerceDemos.business.abstracts.UserInfoCheckService;
import eCommerceDemos.business.abstracts.UserService;
import eCommerceDemos.business.concretes.UserManager;
import eCommerceDemos.business.concretes.checkUserInfoManager;
import eCommerceDemos.core.abstracts.OuterService;
import eCommerceDemos.core.concretes.OutServiceAdapter;
import eCommerceDemos.dataAccess.abstracts.UserDao;
import eCommerceDemos.dataAccess.concretes.HibernateUserDao;
import eCommerceDemos.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Şehriyar", "Hesenov", "shah2021", "shahhasan44@gmail.com");
		User user1 = new User(2, "Cavidan", "Hesenov", "cavidan2007", "hcav2007@gmail.com");
		User user2 = new User(3, "Pashayev", "Murad", "19941007", "pshmrd4@gmail.com");

		UserManager userManager = new UserManager(new checkUserInfoManager(), new HibernateUserDao(),
				new OutServiceAdapter());

		userManager.userRegister(user);
		userManager.userRegister(user1);
		
		
		
		 userManager.userLogIn("shahhasan44@gmail.com", "shah2021");

	}

}
