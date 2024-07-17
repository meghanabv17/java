class Blinkit
{
	static double price;
	public static double takeOrder(String foodname){
		if(foodname=="Amul Pure Milk Cheese Slices")
		{
			return 144.00;
		}
		if(foodname=="Nandini Curd")
		{
			return 40.00;
		}if(foodname=="Brown Rolling Paper Cones")
		{
			return 90.00;
		}
		if(foodname=="Brown Rolling Paper Cones")
		{
			return 80.00;
		}
		if(foodname=="Chandan Mint Saunf Mouth Freshener")
		{
			return 50.00;
		}if(foodname=="Coca-Cola Soft Drink")
		{
			return 69.00;
		}if(foodname=="Happydent")
		{
			return 46.00;
		}if(foodname=="Red Bull Energy Drink")
		{
			return 125.00;
		}if(foodname=="Haldiram's Nagpur Lite Chivda Namkeen")
		{
			return 40.00;
		}if(foodname=="Spraymintt Thanda Paan Mouth Freshener")
		{
			return 99.00;
		}if(foodname=="Kennel Kitchen Chicken Liver")
		{
			return 356.00;
		}if(foodname=="Meatzza Fresh Mince Chicken Keema")
		{
			return 260.00;
		}if(foodname=="TC Master Chef Crunchy Chicken")
		{
			return 277.00;
		}if(foodname=="Onion")
		{
			return 50.00;
		}if(foodname=="Tender Coconut")
		{
			return 65.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
	if(foodname=="Tender Coconut")
	{
		price=65*quantity;
	}return price;
}	
}