package com.fdmgroup.rbcproject;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Fruit> basketContents = new ArrayList<>();
	private int quantity = 0;
	private double price;
	private double totalPrice = 0;
	private int totalItemsInBasket = 0;
	
	public Basket(List<Fruit> basketContents){
		this.basketContents = new ArrayList<>();
	}
	
	public double getTotalPrice(){
		for (Fruit fruit : basketContents) {
			totalPrice = totalPrice +(fruit.getPrice() * fruit.getQuantity());
		}
		return totalPrice;
	}
	
	public int getBasketSize(){
		for (Fruit fruit : basketContents) {
			totalItemsInBasket = totalItemsInBasket + fruit.getQuantity();
		}
		return totalItemsInBasket;
	}
	
	public void getFruitsInBasket(String fruitName, double price, int quantity){
		Fruit fruit = new Fruit(fruitName, price, quantity);
		basketContents.add(fruit);
	}
}
