class SunGlasses
{
	String name;
	double price;
	int id;
	public boolean create(String name, double price, int id)
	{
		boolean isCreated=false;
		if(name != null && price > 0.0 && id > 0)
		{
			this.name = name;
			this.price = price;
			this.id = id;
			isCreated=true;
		}return isCreated;
	}
	public void SunGlassesInfo()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The sunglass name is: "+name);
		System.out.println("The price of the glass is: "+price);
		System.out.println("The id is: "+id);
	}
}