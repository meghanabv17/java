class WatchShopRunner
{
	public static void main(String [] Watch)
	{
		
		boolean watchName = WatchShop.WatchBrands("Rolex");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("GUCCI");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("PUMA");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("Cartier");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("Fastrack");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("ZENITH");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("OMEGA");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("Allen Solly");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("Invicta");
		System.out.println(watchName);
		
		watchName = WatchShop.WatchBrands("Quartz");
		System.out.println(watchName);
		
		WatchShop.getAllBrands();
		
		boolean updateBrand = WatchShop.updateWatchBrands("GUCCI" , "SEIKO");
		WatchShop.getAllBrands();
		
		WatchShop.deletedWatch("SEIKO");
		WatchShop.getAllBrands();
	}
}