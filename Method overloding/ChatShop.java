import java.util.*;
class ChatShop
{
	static String chatNames[]={null, null, null, null, null, null};
	static double chatPrices[]={0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	static int chatIndex;
	static int priceIndex;
	public static boolean createChatNames(String chatName)
	{
		boolean ischatNameCreated=false;
		if(chatName != null)
		{
			ChatNames[chatindex] =chatName;
			chatindex++;
			ischatnamecreated=true;
		}
			else System.out.println("Only Provide a added chatName");
			return ischatnamecreated;
			
	}
	
	
	public static boolean createprice(double chatprice)
	{
		boolean ischatnamepricecreated=false;
		if(chatprice > 0.0)
		{
			
			Chatprices[priceindex] =chatprice;
			priceindex++;
			ischatnamepricecreated=true;
		}
			else System.out.println("Only Provide a valid price");
			return ischatnamepricecreated;
	}
	public static void getChat()
	{
		System.out.println("--------------------------------------------------------------");
		for(String chatName : ChatNames)
		{
			System.out.println("The available chat names are: "+chatName);
		}
	}
	public static void getChatprice()
	{
		System.out.println("----------------------------------------------------------------");
		for(double chatprice : Chatprices)
		{
			System.out.println("The available chat price are: "+chatprice);
		}
	}
	public static boolean updateChatName(String oldChatName, String newChatName)
	{
		boolean isChatNameUpdated=false;
		for(int index=0; index < ChatNames.length ; index++)
		{
			if(oldChatName == ChatNames[index])
			{
				ChatNames[index] = newChatName;
				isChatNameUpdated=true;
			}
		}
		if(isChatNameUpdated == false)
		{
			System.out.println(oldChatName + "Not added");
		}return isChatNameUpdated;
	}
	public static boolean deleteChatNames(String chatNameDeleted)
	{
		System.out.println("Deleting chat name started");
		boolean isChatNameDeleted = false;
		int oldIndex, newIndex;
		for(newIndex=0, oldIndex=0; oldIndex < ChatNames.length; oldIndex++)
		{
			if(ChatNames[oldIndex] != chatNameDeleted)
			{
				ChatNames[newIndex] = ChatNames[oldIndex];
				newIndex++;
			}
		}
		ChatNames = Arrays.copyOf(ChatNames , newIndex);
		if(ChatNames != null)
		{
			isChatNameDeleted = true;
		}
		if(isChatNameDeleted = false)
		{
			System.out.println(chatNameDeleted + "Not found");
		}
		System.out.println("Deleting chat name ended");
		return isChatNameDeleted;
	}	
}