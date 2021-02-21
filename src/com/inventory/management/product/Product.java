package com.inventory.management.product;

import java.math.BigDecimal;

/**
 * this class describes order details
 * **/
public class Product {

	private final ProductID productID;
	private ProductCategory productCategory;
	private final BigDecimal unitPrice ;
	private final int quantity;

	public Product(ProductID productID, ProductCategory productCategory, BigDecimal unitPrice, int quantity) {
		this.productID = productID;
		this.productCategory = productCategory;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}


	public ProductID id() {
		return this.productID;
	}

	public int quantity() {
		return quantity;
	}

	public BigDecimal unitPrice() {
		return unitPrice;
	}

	public ProductCategory productType() {
		return productCategory;
	}

	@Override
	public String toString() {
		return "Product{" + "productID=" + productID + ", productType=" + productCategory + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + '}';
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productID == null) ? 0 : productID.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productID == null) {
			if (other.productID != null)
				return false;
		}
		return true;
	}

	public int addQuantityWithStock(int newQuantity) {
		return quantity + newQuantity;
	}

	public int reduceQuantityWithStock(int newQuantity) {
		if (quantity != 0 && newQuantity != 0 && quantity - newQuantity > 0) {
			return quantity - newQuantity;
		} else {
			return quantity;
		}

	}
}
