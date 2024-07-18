class Agarbathi
{
	String brandName;
	int noOfSticks;
	String fragrance;
	double price;
	public boolean create(String brandName, int noOfSticks, String fragrance, double price)
	{
		boolean iscreated=false;
		if(brandName != null && noOfSticks > 0 && fragrance != null && price > 0)
		{
			this.brandName = brandName;
			this.noOfSticks = noOfSticks;
			this.fragrance = fragrance;
			this.price = price;
			iscreated = true;
		}return iscreated;
	}
	public void displayAgarbathiInfo()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("The brand name is: "+brandName);
		System.out.println("The number of sticks are: "+noOfSticks);
		System.out.println("The fragrance is: "+fragrance);
		System.out.println("The price is: "+price);
	}
}