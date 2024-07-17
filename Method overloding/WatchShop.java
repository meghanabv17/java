import java.util.*;
class WatchShop
{
	static String addWatchBrandNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean WatchBrands(String watchNames)
	{
		System.out.println("Adding watch brand names started");
		boolean iswatchNameAdded=false;
		if(watchNames != null)
		{
			addWatchBrandNames[index] = watchNames;
			index++;
			iswatchNameAdded = true;
		}else
		{
			System.out.println("Watch brand is not added");
		}System.out.println("Adding watch brand names ended");
		return iswatchNameAdded;
	}
	public static void getAllBrands()
	{
		System.out.println("---------------------------------------------------------------------------");
		for(String watchNames : addWatchBrandNames)
		{
			System.out.println("The available watch brands are: "+watchNames);
		}
	}
	public static boolean updateWatchBrands(String oldbrand, String newbrand)
	{
		boolean isWatchBrandUpdated=false;
		System.out.println("---------------------------------------------------------------------------");
		isWatchBrandUpdated=false;
		for(index=0; index < addWatchBrandNames.length; index++)
		{
			if(oldbrand == addWatchBrandNames[index])
			{
				addWatchBrandNames[index] = newbrand;
				isWatchBrandUpdated = true;
			}
		}
		if(isWatchBrandUpdated = false)
		{
			System.out.println(oldbrand + "Not Found");
		}return isWatchBrandUpdated;
	}
	public static boolean deletedWatch(String Brandtobedeleted)
	{
		System.out.println("delete watch brand started");
		boolean isbranddeleted = false;
		int newwatch, oldwatch;
		for(oldwatch=0, newwatch=0; oldwatch < addWatchBrandNames.length; oldwatch++)
		{
			if(addWatchBrandNames[oldwatch] != Brandtobedeleted)
			{
				addWatchBrandNames[newwatch] = addWatchBrandNames[oldwatch];
				newwatch++;
			}
		}
		addWatchBrandNames = Arrays.copyOf(addWatchBrandNames , newwatch);
		if(addWatchBrandNames != null)
		{
			isbranddeleted = true;
		}
		if(isbranddeleted = false)
		{
			System.out.println(Brandtobedeleted + "Not found");
		}System.out.println("delete watch brand ended");
		return isbranddeleted;
	}
}