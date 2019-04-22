package com.example.dto;

public class CartItemWithNameAndPrice {
	
	private int id;
	private String productName;
	private int quantity;
	private double price;
	
	public CartItemWithNameAndPrice(int id, String productName, int quantitiy, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.quantity = quantitiy;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
