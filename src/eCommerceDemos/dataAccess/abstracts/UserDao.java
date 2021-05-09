package eCommerceDemos.dataAccess.abstracts;

import java.util.List;

import eCommerceDemos.entities.concretes.User;

public interface UserDao {

	void addToDatabase(User user);
	
	List<User> getAll();
	
}
