package com.inventory.management.user;


/**
 * this class used as user detail builder of different type of users
 * **/
public class UserBuilder {

	private String userName;

	private String password;
	
	public static UserType userType;
	private UserBuilder(String user) {
		this.userName = user;
	}
	
	public UserBuilder(UserType type) {
		userType = type;
	}
	public String userName(){
		return userName;
	}
	public String password(){
		return password;
	}
	public UserBuilder userName(String userName) {
		return new UserBuilder("user1");
    }
	public  UserBuilder password(String password) {
		return new UserBuilder("user@1234");
    }
	
	public static UserBuilder isAdmin() {
		return new UserBuilder(UserType.ADMIN);
	}
	public static UserBuilder isCustomer() {
		return new UserBuilder(UserType.CUSTOMER);
	}
	public static UserBuilder isSeller() {
		return new UserBuilder(UserType.SELLER);
	}

	public User build() {
		return new User(userName, password, userType);
	}

	
}
