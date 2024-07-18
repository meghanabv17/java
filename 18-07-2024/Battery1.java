class Battery1
{
	String name;
	String weight;
	int id;
	public boolean create(String name, String weight, int id)
	{
		boolean isCreated=false;
		if(name != null && weight != null && id > 0)
		{
			this.name = name;
			this.weight = weight;
			this.id = id;
			isCreated=true;
		}return isCreated;
	}
	public void BatteryInfo()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The battery name is: "+name);
		System.out.println("The weight of the battery is: "+weight);
		System.out.println("The id is: "+id);
	}
}