class LibertyRunner
{
	public static void main(String [] shoeBrand)
	{
		boolean brand = Liberty.ShoesB("PUMA");
		System.out.println(brand);

		brand = Liberty.ShoesB("Levis");
		System.out.println(brand);	

		brand = Liberty.ShoesB("Crocks");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Tommy Hilfiger");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Jordan");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Reebok");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Woodland");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Sparx");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Red Chief");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("US polo");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Steve Madden");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Diesel");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Calvin Klein");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Hugo Boss");
		System.out.println(brand);
		
		brand = Liberty.ShoesB("Champions");
		System.out.println(brand);
		
		Liberty.getAllShoeBrands();
		
		boolean updateShoe = Liberty.updateShorBrands("Red Chief" , "Ferrari");
		Liberty.getAllShoeBrands();
		
		Liberty.deleteShoeBrands("Diesel");
		Liberty.getAllShoeBrands();
	}
}