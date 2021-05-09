package eCommerceDemos.business.concretes;

import eCommerceDemos.business.abstracts.ValidityCheckService;
import eCommerceDemos.dataAccess.abstracts.UserDao;
import eCommerceDemos.entities.concretes.User;

public class ValidtyManager implements ValidityCheckService {

	private UserDao userDao;

	public ValidtyManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isUsed(String mail) {
		for (User user : userDao.getAll()) {

			if (mail.equals(user.geteMail())) {

				System.out.println("Mail Kullanilmishdir gecersiz");

				return false;
			} 
				return true;
			

		}
		return false;
	}

}
