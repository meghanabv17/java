class SimCard
{
	String name;
	String plan;
	int id;
	public boolean create(String name, String plan, int id)
	{
		boolean isCreated=false;
		if(name != null && plan != null && id > 0)
		{
			this.name = name;
			this.plan = plan;
			this.id = id;
			isCreated=true;
		}return isCreated;
	}
	public void SimCardInfo()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The simcard name is: "+name);
		System.out.println("The plan is: "+plan);
		System.out.println("The id is: "+id);
	}
}