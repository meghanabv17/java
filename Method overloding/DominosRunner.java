class DominosRunner
{
	public static void main(String []foodname)
	{
		double finalresult=Dominos.takeOrder("Paneer pizza");
		System.out.println(finalresult);
		finalresult=Dominos.takeOrder("Paneer pizza", 5);
		System.out.println(finalresult);
	}
}