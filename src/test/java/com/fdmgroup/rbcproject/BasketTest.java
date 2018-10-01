package com.fdmgroup.rbcproject;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasketTest {
	
	private List<Fruit> basketContents;
	Basket newBasket;
	Fruit apple;
	
	@BeforeClass
	private static void setUpBeforeClass() throws Exception {
	}

	@Before
	private void setUp() throws Exception {
		basketContents = new ArrayList<>();
		newBasket = new Basket(basketContents);
	}
	
	

	@Test
	private void test_GetFruitsInBasket_ReturnsEmptyBasketContents_IfNoFruitsHaveBeenAdded() {
		assertEquals(0, basketContents.size(), 0);
	}
	
	@Test
	private void test_GetFruitsInBasket_ReturnsBasketSize_IfFruitHasBeenAdded() {
		newBasket.getFruitsInBasket("apple", 0.5, 1);
		assertEquals(1, newBasket.getBasketSize(), 0);
	}
	
	@Test
	private void test_GetFruitsInBasket_ReturnsBasketSize_IfFruitsHaveBeenAdded() {
		newBasket.getFruitsInBasket("apple", 0.5, 3);
		assertEquals(3, newBasket.getBasketSize(), 0);
	}

}
