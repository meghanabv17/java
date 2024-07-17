class GoldShopRunner
{
	public static void main(String [] Goldname)
	{
		boolean goldname = GoldShop.golditem("Armlet");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Bangle");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Bracelet");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Cuff links");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Necklace");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Pendent");
		System.out.println(goldname);
		
		goldname = GoldShop.golditem("Rings");
		System.out.println(goldname);
		
		GoldShop.getGoldNames();
		
		boolean updateName = GoldShop.updateGoldItem("Cuff links" , "Earrings");
		GoldShop.getGoldNames();
		
		GoldShop.deleteItem("Armlet");
		GoldShop.getGoldNames();
	}
}