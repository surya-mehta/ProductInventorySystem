package com.inventory.management.cart;

import static java.math.BigDecimal.valueOf;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.inventory.management.product.Product;
import com.inventory.management.user.User;


/**
 * this class is used for adding products into Cart and getting payable amount
 * **/
public class Cart {
	private User user;
	private LocalDate creationDate;
	private List<Product> products = new ArrayList<>();

	Cart(User user, LocalDate creationDate) {
		this.user = user;
		this.creationDate = creationDate;
	}

	User user() {
		return user;
	}

	LocalDate date() {
		return creationDate;
	}

	void add(Product product) {
		products.add(product);
	}

	public BigDecimal total() {
		return valueOf(
				products.stream().map(item -> item.unitPrice().doubleValue()).reduce((t, acc) -> acc + t).orElse(0.0));
	}
	

}
