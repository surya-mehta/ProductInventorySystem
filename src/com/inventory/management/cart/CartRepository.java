package com.inventory.management.cart;

import java.util.HashMap;
import java.util.Map;

import com.inventory.management.user.User;

/**
 * this class is used to create cart as per user
 * **/

public class CartRepository {

	private Map<User, Cart> map = new HashMap<>();

	public Cart cartFor(User user) {
		return map.getOrDefault(user, createCart(user));
	}

	void save(Cart cart) {
		map.put(cart.user(), cart);
	}

	private Cart createCart(User user) {
		return new Cart(user, java.time.LocalDate.now());
	}

}
