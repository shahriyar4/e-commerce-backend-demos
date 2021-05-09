package eCommerceDemos.business.concretes;

import eCommerceDemos.business.abstracts.UserInfoCheckService;
import eCommerceDemos.business.abstracts.UserService;
import eCommerceDemos.business.abstracts.ValidityCheckService;
import eCommerceDemos.core.abstracts.OuterService;
import eCommerceDemos.dataAccess.abstracts.UserDao;
import eCommerceDemos.entities.concretes.User;

public class UserManager implements UserService {

	UserInfoCheckService checkService;

	UserDao userDao;

	OuterService outerService;

	public UserManager(UserInfoCheckService checkService, UserDao userDao, OuterService outerService) {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
		this.outerService = outerService;
	}

	@Override
	public void userRegister(User user) {

		ValidityCheckService validityCheckService = new ValidtyManager(userDao);

		if (validityCheckService.isUsed(user.geteMail()) && checkService.checkEMail(user.geteMail())
				&& checkService.checkFirstName(user.getFirstName()) && checkService.checkLastName(user.getLastName())
				&& checkService.checkPassword(user.getPassword())

		) {
			userDao.addToDatabase(user);
			outerService.registerWOS();
			System.out.println("Dogrulama maili gonderildi: " + user.geteMail());
			String allname = user.getFirstName() + " " + user.getLastName();
			System.out.println("Kayit islemi tamamlanmisdir: " + allname);
		} else {
			System.out.println("Kayit ishlemi tamamlanmadi");
		}

	}

	@Override
	public void userLogIn(String eMail, String password) {
		for (int i = 0; i < userDao.getAll().size(); i++) {

			if (userDao.getAll().get(i).geteMail().equals(eMail)
					&& userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Giriş Başarılı!");
				return;

			} else {
				System.out.println("Sifre ve ya Email yanlish");
				return;
			}
		}

	}

}
