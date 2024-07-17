class ChatShopRunner
{
	public static void main(String [] chat)
	{
		boolean name=ChatShop.createChatNames("Sev Puri");
		System.out.println(name);
		boolean price=ChatShop.createprice(20.0);
		System.out.println(price);
		
		name=ChatShop.createChatNames("Masal Puri");
		System.out.println(name);
		price=ChatShop.createprice(40.0);
		System.out.println(price);

		name=ChatShop.createChatNames("Pav Bajji");
		System.out.println(name);
		price=ChatShop.createprice(25.0);
		System.out.println(price);

		name=ChatShop.createChatNames("Potato twister");
		System.out.println(name);
		price=ChatShop.createprice(80.0);
		System.out.println(price);

		name=ChatShop.createChatNames("Nippat Masala");
		System.out.println(name);
		price=ChatShop.createprice(40.0);
		System.out.println(price);
		
		name=ChatShop.createChatNames("Dahi puri");
		System.out.println(name);
		price=ChatShop.createprice(40.0);
		System.out.println(price);
		
		ChatShop.getChat();
		ChatShop.getChatprice();
		
		boolean updateChatName=ChatShop.updateChatName("Nippat Masala", "Pani puri");
		ChatShop.getChat();
		
		ChatShop.deleteChatNames("Pav Bajji");
		ChatShop.getChat();
		
		ChatShop.deleteChatNames("Dahi puri");
		ChatShop.getChat();
		

	}
}