class SwiggyRunner1
{
	public static void main(String []foodname)
	{
		double finalresult=Swiggy1.takeOrder("pizza");
		System.out.println("The price of pizza is: "+finalresult);
		finalresult=Swiggy1.takeOrder("pizza",3);
		System.out.println(finalresult);
		}
}
		