class BarRunner
{
	public static void main(String [] Brand)
	{
		boolean bar = Bar.wine("Fratelli");
		System.out.println(bar);
		
		bar = Bar.wine("Big Banyan");
		System.out.println(bar);
		
		bar = Bar.wine("Krsma");
		System.out.println(bar);
		
		bar = Bar.wine("Sula");
		System.out.println(bar);
		
		bar = Bar.wine("Charosa");
		System.out.println(bar);
		
		bar = Bar.wine("Red Wine");
		System.out.println(bar);
		
		bar = Bar.wine("Grover Zampa");
		System.out.println(bar);
		
		bar = Bar.wine("Barefoot Cellars");
		System.out.println(bar);
		
		bar = Bar.wine("Egon Muller");
		System.out.println(bar);
		
		bar = Bar.wine("Penfold");
		System.out.println(bar);
		
		bar = Bar.wine("Yellow tail");
		System.out.println(bar);
		
		bar = Bar.wine("Chandon");
		System.out.println(bar);
		
		bar = Bar.wine("Tuborg");
		System.out.println(bar);
		
		bar = Bar.wine("Lafite Rothschild");
		System.out.println(bar);
		
		bar = Bar.wine("KingFisher");
		System.out.println(bar);
		
		Bar.getBrandNames();
		
		boolean updateBrand = Bar.updateBrandNames("Yellow tail" , "Banshee Wines");
		Bar.getBrandNames();
		
		Bar.deletebrand("Lafite Rothschild");
		Bar.getBrandNames();
	}
}