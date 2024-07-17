import java.util.Arrays;
class GoldShop
{
	static String addGolditems[] = {null, null, null, null, null, null, null};
	static int index;
	public static boolean golditem(String gold)
	{
		boolean isgoldnameadded=false;
		System.out.println("Adding a gold name is started");
		isgoldnameadded=false;
		if(gold != null)
		{
			addGolditems[index] = gold;
			index++;
			isgoldnameadded=true;
		}else
		{
			System.out.println("Gold name is not added....");
		}System.out.println("Adding a gold name is ended");
		return isgoldnameadded;
	}
	public static void getGoldNames()
	{
		System.out.println("-------------------------------------------------------------------------------------------");
		for(String gold : addGolditems)
		{
			System.out.println("The gold name is: " + gold);
		}
	}
	public static boolean updateGoldItem(String oldname, String newname)
	{
		System.out.println("---------------------------------------------------------------------------------------------");
		boolean isGoldNameUpdated=false;
		for(index=0; index < addGolditems.length; index++)
		{
			if(oldname == addGolditems[index])
			{
				addGolditems[index] = newname;
				isGoldNameUpdated = true;
			}
		}
		if(isGoldNameUpdated = false)
		{
			System.out.println(oldname + "Not available");
		}return isGoldNameUpdated;
	}
	public static boolean deleteItem(String itemdeleted)
	{
		System.out.println("Deleting item started");
		boolean isitemdeleted = false;
		int olditem, newitem;
		for(newitem=0, olditem=0; olditem < addGolditems.length; olditem++)
		{
			if(addGolditems[olditem] != itemdeleted)
			{
				addGolditems[newitem] = addGolditems[olditem];
				newitem++;
			}
		}
		addGolditems = Arrays.copyOf(addGolditems, newitem);
		if(addGolditems != null)
		{
			isitemdeleted = true;
		}
		if(isitemdeleted = false)
		{
			System.out.println(itemdeleted + "Not found");
		}System.out.println("Deleting item ended");
		return isitemdeleted;
	}
}