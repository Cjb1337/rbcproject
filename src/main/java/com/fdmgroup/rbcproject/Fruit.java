package com.fdmgroup.rbcproject;

public class Fruit {

	private String name;
	private double price;
	private int quantity;
	
	public Fruit(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}
}
