package com.inventory.management.user;
/**
 * this class is used to validate user details from repository
 * **/
public class AuthenticationService {

	UserRepository userRepository;
	public static User user = UserBuilder.isCustomer().userName("user1").password("user@1234").build();

	public AuthenticationService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	boolean authenticateUser(String userName) {
		User userNew = userRepository.getUserDetail(userName);
		return (userNew.userName().equals(user.userName()) && userNew.password().equals(user.password()));

	}

}
