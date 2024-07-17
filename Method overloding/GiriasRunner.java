class GiriasRunner
{
	public static void main(String []hmm)
	{
		boolean home=Girias.appliances("Air conditioner");
		System.out.println(home);
		
		home=Girias.appliances("Stand Fan");
		System.out.println(home);
		
		home=Girias.appliances("Mixer");
		System.out.println(home);
		
		home=Girias.appliances("Cooler");
		System.out.println(home);
		
		home=Girias.appliances("Fridge");
		System.out.println(home);
		
		home=Girias.appliances("Cooker");
		System.out.println(home);
		
		home=Girias.appliances("Iron box");
		System.out.println(home);
		
		home=Girias.appliances("Switch");
		System.out.println(home);
		
		home=Girias.appliances("Cable extension");
		System.out.println(home);
		
		home=Girias.appliances("Flask");
		System.out.println(home);
		
		home=Girias.appliances("Electric stove");
		System.out.println(home);
		
		home=Girias.appliances("Microwave oven");
		System.out.println(home);
		
		Girias.getHomeAppliances();
		
		boolean updateName = Girias.getUpdateAppliances("Switch" , "Charger");
		Girias.getHomeAppliances();
		
		Girias.deleteappliances("Electric stove");
		Girias.getHomeAppliances();
	}
}