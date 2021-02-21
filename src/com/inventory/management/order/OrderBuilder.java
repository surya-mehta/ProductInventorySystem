package com.inventory.management.order;


import java.math.BigDecimal;
import java.util.Date;

import com.inventory.management.product.Product;
import com.inventory.management.product.ProductBuilder;
import com.inventory.management.user.User;


/**
 * this class used as order details builder of given product
 * **/

public class OrderBuilder {
	
	private static final BigDecimal THOUSAND_RUPEES = new BigDecimal(1000);
	private static final int QTY_10 = 1;
	public static final Product SKIRTS = ProductBuilder.aWomenWear().withId("10001").costing(THOUSAND_RUPEES).withQuantity(QTY_10).build();

	private BigDecimal price = BigDecimal.ZERO;
	private int total;
	private Date date= new Date();
	private Product product= SKIRTS;
	private int id ;
	private String billNumber;
	private int quantity;
	private User user;
	private OrderStatus orderStatus;
		
	private OrderBuilder(Date date2) {
		this.date = date2;
	}
	
	public static OrderBuilder date(Date date) {
		return new OrderBuilder(date);
    }
	
	public OrderBuilder skirtCAtegory() {
        this.product = SKIRTS;
        return this;
    }

	
    public OrderBuilder withId(int id) {
        this.id = id;
        return this;
    }

	public OrderBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	public OrderBuilder user() {
		return this;
	}

	public Order build() {
		return new Order(id, quantity, total,date,product,user,
				billNumber,orderStatus);
	}

	public OrderBuilder total(BigDecimal fiveThousandRupees) {
		this.price= fiveThousandRupees;
		return this;
	}
	public OrderBuilder billNumber(String billNumber) {
		this.billNumber= billNumber;
		return this;
	}
	
}
