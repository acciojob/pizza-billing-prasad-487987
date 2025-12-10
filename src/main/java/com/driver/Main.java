package com.driver;

public class pizzaMain {
	 public static void main(String[] args) {
		    DeluxePizza dp = new DeluxePizza(false);
		    dp.addTakeaway();
		    dp.addExtraCheese();
		    dp.addTakeaway();
		    System.out.println(dp.getBill());

		    Pizza p = new Pizza(true);
		    p.addExtraCheese();
		    p.addExtraToppings();
		    p.addTakeaway();
		    System.out.println(p.getBill());
		  }
}
