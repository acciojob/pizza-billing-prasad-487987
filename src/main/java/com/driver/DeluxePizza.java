package com.driver;

public class DeluxePizza extends Pizza {
	 public DeluxePizza(Boolean isVeg) {
	        super(isVeg);
	        addExtraCheese();
	        addExtraToppings();
	        
	    }
	 
	 @Override
	    public void addExtraCheese() {
	        // Do nothing if called again
	        super.addExtraCheese();
	    }

	    @Override
	    public void addExtraToppings() {
	        // Do nothing if called again
	        super.addExtraToppings();
	    }
	   
	    
	    
}
