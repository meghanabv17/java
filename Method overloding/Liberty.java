import java.util.*;
class Liberty
{
	static String addShoeBrands[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean ShoesB(String ShoeBrands)
	{
		System.out.println("Add shoe Brands started");
		boolean isShoeBrandAdded = false;
		if(ShoeBrands != null)
		{
			addShoeBrands[index] = ShoeBrands;
			index++;
			isShoeBrandAdded = true;
		}else
		{
			System.out.println("Shoe Brand is not added");
		}	System.out.println("Add Shoe Brands ended");
		return isShoeBrandAdded;
	}
	public static void getAllShoeBrands()
	{
		System.out.println("--------------------------------------------------------------------------------------------");
		for(String ShoeBrands : addShoeBrands)
		{
			System.out.println("The available shoe brands are: "+ShoeBrands);
		}
	}
	public static boolean updateShorBrands(String oldbrand, String newbrand)
	{
		System.out.println("-------------------------------------------------------------------------------------------");
		boolean isbrandNameUpdated=false;
		for(index=0; index < addShoeBrands.length; index++)
		{
			if(oldbrand == addShoeBrands[index])
			{
			addShoeBrands[index] = newbrand;
			isbrandNameUpdated = true;
			}
		}
	if(isbrandNameUpdated == false)
	{
		System.out.println(oldbrand + "Not found");
	}return isbrandNameUpdated;
	}
	public static boolean deleteShoeBrands(String shoeNametobedeleted)
	{
		System.out.println("Delete operation started");
		boolean isshoenamedeleted = false;
		int oldshoe, newshoe;
		for(oldshoe=0, newshoe=0; oldshoe < addShoeBrands.length; oldshoe++)
		{
			if(addShoeBrands[oldshoe] != shoeNametobedeleted)
			{
				addShoeBrands[newshoe] = addShoeBrands[oldshoe];
				newshoe++;
			}
		}
		addShoeBrands = Arrays.copyOf(addShoeBrands , newshoe);
		if(shoeNametobedeleted != null)
			isshoenamedeleted = true;
		if(isshoenamedeleted = false)
		{
			System.out.println(shoeNametobedeleted + "Not found");
		}System.out.println("Delete operation ended");
		return isshoenamedeleted;
	}
}

		