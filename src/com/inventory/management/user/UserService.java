package com.inventory.management.user;

import java.util.HashMap;
import java.util.Map;

/**
 * This class supports repository and provide mapping of users
 * **/
public class UserService {
	
	UserRepository repository;

	public UserService(UserRepository repository) {
		super();
		this.repository = repository;
	}

	public static final User USER1 = UserBuilder.isCustomer().userName("user1").password("user1@1234").build();
	public static final User USER2 = UserBuilder.isAdmin().userName("user1").password("user2@1234").build();

	private static Map<String, User> map = new HashMap<String, User>() {
		{
			map.put(USER1.userName(), USER1);
			map.put(USER2.userName(), USER2);

		}
	};

	public void save(User user) {
		repository.save(user);
	}

}
