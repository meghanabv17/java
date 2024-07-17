class ZeptoRunner
{
	public static void main(String []foodname)
	{
	double product=Zepto.takeOrder("MTR Minute Fresh Dosa Batter");
	System.out.println(product);
	product=Zepto.takeOrder("MTR Minute Fresh Dosa Batter",8);
	System.out.println(product);
}
}
