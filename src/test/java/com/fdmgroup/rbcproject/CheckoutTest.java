package com.fdmgroup.rbcproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckoutTest {
	
	Checkout newCheckout;
	Basket newBasket;
	List<Fruit> basketContents;

	@BeforeClass
	private static void setUpBeforeClass() throws Exception {
	}

	@Before
	private void setUp() throws Exception {
		newCheckout = new Checkout();
		newBasket = new Basket(basketContents);
		newBasket.getFruitsInBasket("lychee", 1, 100);
	}

	@Test
	private void testBasketSizeCalculator(){
		int size = newBasket.getBasketSize();
		assertEquals(100, size, 0);
	}
	
	@Test
	private void testPriceCalculator() {
		double price = newCheckout.calculatePrice(newBasket);
		assertEquals(100, price, 0);
	}
	
	@Test
	private void testPriceCalculatorForSeveralItems() {
		newBasket.getFruitsInBasket("orange", 5, 50);
		double price = newCheckout.calculatePrice(newBasket);
		assertEquals(350, price, 0);
	}

}
