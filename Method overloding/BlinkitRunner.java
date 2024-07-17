class BlinkitRunner
{
	public static void main(String []foodname)
	{
		double order=Blinkit.takeOrder("Tender Coconut");
		System.out.println(order);
		order=Blinkit.takeOrder("Tender Coconut",3);
		System.out.println(order);
	}
}