import java.util.Arrays;
class Girias
{
	static String homeAppliances[]={null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean appliances(String Appliances)
	{
		System.out.println("Home Appliances started");
		boolean isselected=false;
		if(Appliances != null)
		{
			homeAppliances[index] = Appliances;
			index++;
			isselected=true;
		}
		else
		{
			System.out.println("Please provide a valid appliances");
		}System.out.println("Home Appliances ended");
		return isselected;
		
	}
	public static void getHomeAppliances()
	{
		System.out.println("--------------------------------------------------------------------------------------");
		for(String Appliances : homeAppliances)
		{
			System.out.println("The equipment is:"+ Appliances);
		}
	}
	public static boolean getUpdateAppliances(String oldAppliance, String newAppliance)
	{
		System.out.println("---------------------------------------------------------------------------------------");
		boolean isApplianceUpdated=false;
		for(int index=0; index < homeAppliances.length; index++)
		{
			if(oldAppliance == homeAppliances[index])
			{
				homeAppliances[index] = newAppliance;
				isApplianceUpdated=true;
			}
		}
		if(isApplianceUpdated == false)
		{
			System.out.println(oldAppliance + "Not found");
		}return isApplianceUpdated;
	}
	public static boolean deleteappliances(String appliancesToBeDeleted)
	{
		boolean isappliancesdeleted = false;
		int newitem, olditem;
		for(newitem=0, olditem=0; olditem < homeAppliances.length; olditem++)
		{
			if(homeAppliances[olditem] != appliancesToBeDeleted)
			{
				homeAppliances[newitem] = homeAppliances[olditem];
				newitem++;
			}else isappliancesdeleted = true;
		}
		homeAppliances = Arrays.copyOf(homeAppliances , newitem);
		/*if(homeAppliances != null)
		{
			isappliancesdeleted = true;
		}*/
		if(isappliancesdeleted = false)
		{
			System.out.println(appliancesToBeDeleted + "Not found");
		}
		System.out.println("Deleting ended");
		return isappliancesdeleted;
	}
}