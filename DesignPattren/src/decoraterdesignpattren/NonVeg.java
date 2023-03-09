package decoraterdesignpattren;

public class NonVeg  extends FoodDecorator{
	public  NonVeg(Food newFood) 
	{
		super(newFood);
		
	}
	
	
	
	public String prepareFood()
	{
		return super.prepareFood() +" With Roasted Chiken and Chiken Curry  "; 
		
	}
	
	
	public double foodPrice()
	{
		return super.foodPrice()+150.0;
		
	}

}
