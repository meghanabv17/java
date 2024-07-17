class Zomato
{
	static double price;
	public static double takeOrder(String foodname){
		if(foodname=="kabab")
		{
			return 950.00;
		}
		if(foodname=="Mithai")
		{
			return 300.00;
		}if(foodname=="Cripse Chilli potato")
		{
			return 159.00;
		}
		if(foodname=="Chilli paneer dry")
		{
			return 219.00;
		}
		if(foodname=="Babycorn")
		{
			return 65.00;
		}if(foodname=="Veg choe mein")
		{
			return 169.00;
		}if(foodname=="French fries")
		{
			return 119.00;
		}if(foodname=="Mutton pepper")
		{
			return 359.00;
		}if(foodname=="Chiken Hakka noodles")
		{
			return 189.00;
		}if(foodname=="Gulab jamoon")
		{
			return 25.00;
		}if(foodname=="Deserts")
		{
			return 100.00;
		}if(foodname=="lassi")
		{
			return 100.00;
		}if(foodname=="Milk shake")
		{
			return 99.00;
		}if(foodname=="Rasagulla")
		{
			return 50.00;
		}if(foodname=="California burrito")
		{
			return 150.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
		if(foodname=="Rasagulla")
		{
			price=50.00*quantity;
			return price;
		}
		//dead code 
		if(foodname=="Milk shake")
		{
			price=99.00*quantity;
			return price;
		}
		return 0.0;
	}
}
