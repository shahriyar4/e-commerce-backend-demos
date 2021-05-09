package eCommerceDemos.business.abstracts;

public interface UserInfoCheckService {
	boolean checkFirstName(String firstname);

	boolean checkLastName(String lastname);

	boolean checkEMail(String eMail);

	boolean checkPassword(String password);

}
