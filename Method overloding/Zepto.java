class Zepto
{
	static double price;
	public static double takeOrder(String foodname){
		if(foodname=="Nan Pro")
		{
			return 825.00;
		}
		if(foodname=="MTR Rava Idli Instant Mix")
		{
			return 184.00;
		}if(foodname=="MAGGI ")
		{
			return 160.00;
		}
		if(foodname=="iD Malabar Parota")
		{
			return 93.00;
		}
		if(foodname=="Akshayakalpa Artisanal Organic Set Curd")
		{
			return 150.00;
		}if(foodname=="Amul Butter")
		{
			return 272.00;
		}if(foodname=="Double Egg & Cheese Sandwich")
		{
			return 125.00;
		}if(foodname=="Nandini Goodlife Toned UHT Milk ")
		{
			return 25.00;
		}if(foodname=="Milky Mist Fruit Yoghurt Strawberry")
		{
			return 140.00;
		}if(foodname=="Bauli Moonfils Choco Cream (With Egg)")
		{
			return 30.00;
		}if(foodname=="The Health Factory Zero Maida Bread")
		{
			return 56.00;
		}if(foodname=="Eggoz Nutrition White Egg")
		{
			return 115.00;
		}if(foodname=="Milky Mist Fresh Malai Paneer Cubes")
		{
			return 101.00;
		}if(foodname=="MTR Minute Fresh Dosa Batter")
		{
			return 80.00;
		}if(foodname=="Epigamia Greek Yogurt- Natural")
		{
			return 65.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
	public static double takeOrder(String foodname, int quantity)
	{
		if(foodname=="MTR Minute Fresh Dosa Batter")
		{
			price=80.00*quantity;
		}return price;
	}
}
