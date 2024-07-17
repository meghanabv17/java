import java.util.Arrays;
class RedChilliesEntertainment
{
	static String movieActors[] ={null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean addMovieActors(String actor)
	{
		System.out.println("Added started");
		boolean isactoradded=false;
		if(actor != null)
		{
			movieActors[index] = actor;
			index++;
			isactoradded=true;
		}else
		{
			System.out.println("Actor is not added");
		}System.out.println("Added ended");
		return isactoradded;
	}
	public static void getMovieActors()
	{
		System.out.println("*****************************************************************************************");
		for(String actor : movieActors)
		{
			System.out.println("The actor name is:" + actor);
		}
	}
	public static boolean UpdateName(String oldname, String newname)
	{
		System.out.println("*****************************************************************************************");
		boolean isNameUpdated=false;
		for(int index=0; index < movieActors.length; index++)
		{
			if(oldname == movieActors[index])
			{
				movieActors[index] = newname;
				isNameUpdated=true;
			}
		}
		if(isNameUpdated=false)
		{
			System.out.println(oldname + "Not found");
		}return isNameUpdated;
	}
	public static boolean deleteActor(String actorToBeDeleted)
	{
		System.out.println("Deleting Started");
		boolean isActorToBeDeleted=false;
		int oldactor, newactor;
		for(newactor=0, oldactor=0; oldactor < movieActors.length; oldactor++)
		{
			if(movieActors[oldactor] != actorToBeDeleted)
			{
				movieActors[newactor] = movieActors[oldactor];
				newactor++;
			}
		}
		movieActors = Arrays.copyOf(movieActors , newactor);
		if(movieActors != null)
		{
			isActorToBeDeleted = true;
		}
		if(isActorToBeDeleted = false)
		{
			System.out.println(isActorToBeDeleted + "Not found");
		}
		System.out.println("Deleting ended");
		return isActorToBeDeleted;
	}
}