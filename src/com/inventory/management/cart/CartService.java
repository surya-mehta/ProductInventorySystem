package com.inventory.management.cart;

import com.inventory.management.product.Product;
import com.inventory.management.product.ProductID;
import com.inventory.management.product.ProductService;
import com.inventory.management.user.User;


/**
 * this class is used to add products into cart and check stock of products
 * **/

public class CartService {

	private ProductService productService;
	private CartRepository cartRepository;

	public CartService(ProductService productService, CartRepository cartRepository) {
		this.productService = productService;
		this.cartRepository = cartRepository;

	}

	public void addProduct(User user, ProductID productID, int quantity) {
		abortIfNotEnoughProductsInStock(productID, quantity);
		addProductToCart(productID, quantity, cartFor(user));
	}

	public Cart cartFor(User user) {
		return cartRepository.cartFor(user);
	}

	private void addProductToCart(ProductID productID, int quantity, Cart cart) {
		Product product = productService.productFor(productID);
		cart.add(product);
		cartRepository.save(cart);
	}

	private void abortIfNotEnoughProductsInStock(ProductID productID, int quantity) {
		if (!productService.hasEnoughProductsInStock(productID, quantity)) {
			throw new NotEnoughProductsInStockException();
		}
	}

}
