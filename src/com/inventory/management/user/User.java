package com.inventory.management.user;

import com.inventory.management.cart.Cart;

/**
 * this class describes user details
 * **/
public class User {

	private String userName;
	private String email;
	private String contactNo;
	private String password;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String district;
	private String state;
	private int id;
	public static UserType userType;
	private Cart cart;
	
	public String userName(){
		return userName;
	}

	public UserType type(){
		return userType;
	}
	public String password(){
		return password;
	}
	public int id(){
		return id;
	}
	public Cart cart(){
		return cart;
	}
	
	User(String userName, String password, UserType userType){
		this.userName = userName;
		this.password = password;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", contactNo=" + contactNo + ", password=" + password
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", district="
				+ district + ", state=" + state + ", id=" + id + ", userType=" + userType + ", cart=" + cart + "]";
	}
	
	
	
}
