class Dominos
{
	static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="Indi Tandoori Paneer Pizza")
		{
			return 305.00;
		}
		if(foodname=="Cheese N Corn Pizza")
		{
			return 179.00;
		}if(foodname=="Eggrole")
		{
			return 59.00;
		}
		if(foodname=="Achari Do Pyaza Pizza")
		{
			return 185.00;
		}
		if(foodname=="Mexican Green Wave Pizza")
		{
			return 265.00;
		}if(foodname=="Farmhouse Pizza")
		{
			return 265.00;
		}if(foodname=="Chicken Dominator")
		{
			return 365.00;
		}if(foodname=="Pepper Barbecue Chicken Pizza")
		{
			return 255.00;
		}if(foodname=="Chicken Fiesta")
		{
			return 315.00;
		}if(foodname=="Keema Do Pyaza Pizza")
		{
			return 255.00;
		}if(foodname=="Indi Chicken Tikka Pizza")
		{
			return 339.00;
		}if(foodname=="veggy loadded pizza")
		{
			return 129.00;
		}if(foodname=="Margherita")
		{
			return 99.00;
		}if(foodname=="Paneer pizza")
		{
			return 229.00;
		}if(foodname=="Mexican Green Wave")
		{
			return 166.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
		if(foodname=="Paneer pizza")
		{
			price=229*quantity;
		}return price;
	}
}