class RedChilliesEntertainmentRunner
{
	public static void main(String [] chilli)
	{
		boolean actorName= RedChilliesEntertainment.addMovieActors("Prabash");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Dhanush");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Allu Arjun");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Prabash");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Vijay Devarakonda");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Naga Chaitanya");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Bachhan");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Chiranjeevi");
		System.out.println(actorName);
		
		actorName= RedChilliesEntertainment.addMovieActors("Jagapathi Babu");
		System.out.println(actorName);
		
		RedChilliesEntertainment.getMovieActors();
		
		boolean updateName = RedChilliesEntertainment.UpdateName("Prabash" , "Yash");
		RedChilliesEntertainment.getMovieActors();
		
		RedChilliesEntertainment.deleteActor("Bachhan");
		RedChilliesEntertainment.getMovieActors();
	}
}