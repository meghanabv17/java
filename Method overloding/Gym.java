import java.util.Arrays;
class Gym
{
	static String gymEquipment[]={null, null, null, null, null, null, null, null};
	static int gymEquipmentindex;
	public static boolean createGym(String Gym)
	{
		boolean iscreated=false;
		if(Gym != null)
		{
			gymEquipment[gymEquipmentindex] = Gym;
			gymEquipmentindex++;
			iscreated=true;
			System.out.println("Is item added: ");
		}
		else
		{
			System.out.println("Please provide a valid equipment");
		}return iscreated;
	}
	public static void getequipment()
	{
		System.out.println("--------------------------------------------------------------------------------");
		for(String Gym : gymEquipment)
		{
			System.out.println("The equipment is:"+ Gym);
		}
	}
	public static boolean GymItemUpdate(String olditem, String newitem)
	{
		System.out.println("-------------------------------------------------------------------------------");
		boolean isGymItemUpdated=false;
		for(int index=0; index<gymEquipment.length; index++)
		{
			if(olditem==gymEquipment[index])
			{
				gymEquipment[index] = newitem;
				isGymItemUpdated=true;
			}
		}
		if(isGymItemUpdated == false)
		{
			System.out.println(olditem + "Not Added");
		}return isGymItemUpdated;
	}
	public static boolean DeleteEquipment(String itemToBeDeleted)
	{
		System.out.println("Deleting Started");
		boolean isitemToBeDeleted=false;
		int oldequip, newequip;
		for(newequip=0, oldequip=0; oldequip < gymEquipment.length; oldequip++)
		{
			if(gymEquipment[oldequip] != itemToBeDeleted)
			{
				gymEquipment[newequip] = gymEquipment[oldequip];
				newequip++;
			}
		}
		gymEquipment = Arrays.copyOf(gymEquipment , newequip);
		if(gymEquipment != null)
		{
			isitemToBeDeleted = true;
		}
		if(isitemToBeDeleted = false)
		{
			System.out.println(itemToBeDeleted + "Not found");
		}
		System.out.println("Deleting ended");
		return isitemToBeDeleted;
	}
}