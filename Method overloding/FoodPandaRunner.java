class FoodPandaRunner
{
	public static void main(String []foodname)
	{
		double finalvalue=Foodpanda1.takeOrder("Veg Palav");
		System.out.println(finalvalue);
		finalvalue=Foodpanda1.takeOrder("Veg Palav",2);
		System.out.println(finalvalue);
	}
}
