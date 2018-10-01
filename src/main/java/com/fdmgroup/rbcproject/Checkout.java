package com.fdmgroup.rbcproject;

public class Checkout {

	public Checkout(){}
	
	public double calculatePrice(Basket basket){
		double totalPrice = basket.getTotalPrice();
		return totalPrice;
	}
}
