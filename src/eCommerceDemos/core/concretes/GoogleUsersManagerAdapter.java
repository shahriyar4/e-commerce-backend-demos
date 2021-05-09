package eCommerceDemos.core.concretes;

import eCommerceDemos.core.abstracts.OuterService;
import eCommerceDemos.entities.concretes.GoogleUserManager;

public class GoogleUsersManagerAdapter implements OuterService {

	@Override
	public void registerWOS() {

		GoogleUserManager manager = new GoogleUserManager();

		manager.register();

	}

}
