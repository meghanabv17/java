import java.util.*;
class Bar
{
	static String addWineBrands[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean wine(String Brands)
	{
		System.out.println("Brand name added started");
		boolean isBrandCreated =false;
		if(Brands != null)
		{
			addWineBrands[index] = Brands;
			index++;
			isBrandCreated =true;
		}else{
			System.out.println("Brand name added ended");
			System.out.println("Brand name is not added");
		}return isBrandCreated;
	}
	public static void getBrandNames()
	{
		System.out.println("---------------------------------------------------------------------------------");
		for(String Brands : addWineBrands)
		{
			System.out.println("The available brands are: "+Brands);
		}
	}
	public static boolean updateBrandNames(String oldbrand, String newbrand)
	{
		System.out.println("--------------------------------------------------------------------------------");
		boolean isBrandUpdates=false;
		for(index=0; index < addWineBrands.length; index++)
		{
			if(oldbrand == addWineBrands[index])
			{
				addWineBrands[index] = newbrand;
				isBrandUpdates = true;
			}
		}
		if(isBrandUpdates = false)
		{
			System.out.println(oldbrand + "Not found");
		}return isBrandUpdates;
	}
	public static boolean deletebrand(String brandtobedeleted)
	{
		System.out.println("Deleting brand is started");
		boolean isbranddeleted = false;
		int newwine, oldwine;
		for(oldwine=0, newwine=0; oldwine < addWineBrands.length; oldwine++)
		{
			if(addWineBrands[oldwine] != brandtobedeleted)
			{
				addWineBrands[newwine] = addWineBrands[oldwine];
				newwine++;
			}
		}
		addWineBrands = Arrays.copyOf(addWineBrands , newwine);
		if(isbranddeleted = true)
		{
			isbranddeleted = true;
		}
		if(isbranddeleted = false)
		{
			System.out.println(brandtobedeleted + "Not found");
		}
		System.out.println("Deleting brand is ended");
		return isbranddeleted;
	}
}