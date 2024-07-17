class Foodpanda1
{
	static double price;
	public static double takeOrder(String foodname){
		if(foodname=="Idli")
		{
			return 50.00;
		}
		if(foodname=="Masala Dosa")
		{
			return 80.00;
		}if(foodname=="Chitranna")
		{
			return 30.00;
		}
		if(foodname=="Mosaranna")
		{
			return 50.00;
		}
		if(foodname=="Bisi bele bath")
		{
			return 65.00;
		}if(foodname=="Chow chow Bath")
		{
			return 69.00;
		}if(foodname=="Palak Paneer")
		{
			return 119.00;
		}if(foodname=="Ghee Rice")
		{
			return 59.00;
		}if(foodname=="Pongal")
		{
			return 89.00;
		}if(foodname=="Poori")
		{
			return 25.00;
		}if(foodname=="Parota")
		{
			return 100.00;
		}if(foodname=="Badam Milk Shake")
		{
			return 100.00;
		}if(foodname=="Avalakki")
		{
			return 99.00;
		}if(foodname=="Set Dosa")
		{
			return 50.00;
		}if(foodname=="Veg Palav")
		{
			return 50.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
		if(foodname=="Veg Palav")
		{
			price=50.00*quantity;
		}return price;
	}
}