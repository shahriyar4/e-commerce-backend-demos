package eCommerceDemos.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemos.business.abstracts.UserInfoCheckService;

public class checkUserInfoManager implements UserInfoCheckService {

	public checkUserInfoManager() {
	}

	@Override
	public boolean checkFirstName(String firstname) {
		if (firstname.length() < 2) {

			System.out.println("Adınız 2 karakterden küçük olmaz");
			return false;
		} else {
			return true;
		}

	}

	@Override
	public boolean checkLastName(String lastname) {

		if (lastname.length() < 2) {

			System.out.println("Soyadiniz 2 karakterden küçük olmaz");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkEMail(String eMail) {

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Mailiniz geçersiz! Lütfen geçerli bir mail giriniz.");
			return false;
		}

	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {

			System.out.println("Şifre 6 karakterden küçük olamaz");
			return false;
		} else {
			return true;
		}

	}

}
