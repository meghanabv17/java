class Swiggy1
{
	static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="pizza")
		{
			return 159.00;
		}
		if(foodname=="Burger")
		{
			return 199.00;
		}if(foodname=="Eggrole")
		{
			return 59.00;
		}
		if(foodname=="chickenrole")
		{
			return 99.00;
		}
		if(foodname=="onionDosa")
		{
			return 69.00;
		}if(foodname=="Samosa")
		{
			return 100.00;
		}if(foodname=="Shawarma")
		{
			return 89.00;
		}if(foodname=="chickenBiriyani")
		{
			return 99.00;
		}if(foodname=="MuttonBiriyani")
		{
			return 299.00;
		}if(foodname=="IceCream")
		{
			return 49.00;
		}if(foodname=="CupCake")
		{
			return 199.00;
		}if(foodname=="RedVelvetChocolate")
		{
			return 185.00;
		}if(foodname=="Parota")
		{
			return 25.00;
		}if(foodname=="PaneerTikka")
		{
			return 129.00;
		}if(foodname=="VegBiriyani")
		{
			return 66.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
	if(foodname=="pizza")
	{
		price=159.00*quantity;
	}	return price;
	}
}