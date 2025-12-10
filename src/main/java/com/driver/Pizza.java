package com.driver;

public class Pizza {

	 protected int totalPrice;
	 protected int basePrice;
	 protected int vegPizzaBaseprice1 = 300;
	 protected int deluxBaseprice = 400;
	 protected Boolean isVeg;
	 protected String bill;
	 
	 protected int extraToppingsPrice;
	 protected boolean extraCheese=false;
	 protected boolean extraToppings= false;
	 protected boolean isPaperBagAdded=false;
	 
	 protected int paperBagPrice = 20;
	 protected int extraCheesePrice = 80;
	    
     public Pizza(Boolean isVeg){
	        this.isVeg = isVeg;
	        if(this.isVeg) {
	        	totalPrice=300;
	        	
	        	extraToppingsPrice = 70;
	        }else {
	            totalPrice = 400;
	            extraToppingsPrice = 120;
	        }
	        
	        basePrice=totalPrice;
	        bill += "Base Price Of The Pizza: " + basePrice + "\n";
	    }

	    public int getPrice(){
	        return this.totalPrice;
	    }

	    public void addExtraCheese(){
	        if(!extraCheese) {
	        	totalPrice += 80;
	        	extraCheese=true;
	        
	         }
	    }

	    public void addExtraToppings(){
	        totalPrice += extraToppingsPrice;
	        extraToppings= true;
	    }

	 public void addTakeaway(){
	        if(!isPaperBagAdded) {
	        	totalPrice +=20;
	        	isPaperBagAdded=true;
	        	
	        }
	    }

    
        public String getBill(){
	    	 if (extraCheese) {
	             bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
	         }
	         if (extraToppings) {
	             bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
	         }
	         if (isPaperBagAdded) {
	             bill += "Paperbag Added: " + paperBagPrice + "\n";
	         }	 
	         
	         bill += "Total Price:" + totalPrice;
	         
	         return bill;
	    }
}
