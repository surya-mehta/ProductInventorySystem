package com.inventory.management.user;

import java.util.HashMap;
import java.util.Map;

/**
 * this class used as user repository class to get particular user details and add user details
 * **/
public class UserRepository {
	private Map<String, User> users = new HashMap<>();

	void save(User user) {
		/**
		 * In case of Database , need to add User in User table from here
		 */
		users.put(user.userName(), user);
	}

	User getUserDetail(String name) {
		/**
		 * In case of Database , need to fetch User from User table
		 */
		return users.get(name);

	}
}
