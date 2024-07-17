class ZomatoRunner
{
	public static void main(String []foodname)
	{
		double finalvalue=Zomato.takeOrder("Rasagulla");
		System.out.println(finalvalue);
		finalvalue=Zomato.takeOrder("Rasagulla",12);
		System.out.println(finalvalue);
		finalvalue=Zomato.takeOrder("Milk shake");
		System.out.println(finalvalue);
		finalvalue=Zomato.takeOrder("Milk shake",5);
		System.out.println(finalvalue);
	}
}