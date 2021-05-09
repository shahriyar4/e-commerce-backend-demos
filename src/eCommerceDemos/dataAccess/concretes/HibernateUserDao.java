package eCommerceDemos.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemos.dataAccess.abstracts.UserDao;
import eCommerceDemos.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	

	private List<User> users;

	public HibernateUserDao() {

		this.users = new ArrayList<User>();
	}

	@Override
	public void addToDatabase(User user) {
		this.users.add(user);

		System.out.println(user.getId() + " idli " + user.getFirstName() + " Kullanicisi Kaydedildi ");
	}

	@Override
	public List<User> getAll() {

		return this.users;
	}

}
