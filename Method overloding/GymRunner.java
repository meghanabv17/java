class GymRunner
{
	public static void main(String [] gym)
	{
		boolean name=Gym.createGym("Dumbbells");
		System.out.println( name);
		
		name=Gym.createGym("Barbells");
		System.out.println(name);
		
		name=Gym.createGym("Cycling");
		System.out.println(name);
		
		name=Gym.createGym("Weight Plates");
		System.out.println(name);
		
		name=Gym.createGym("Kettlebells");
		System.out.println(name);
		
		name=Gym.createGym("Squat Rack");
		System.out.println(name);
		
		name=Gym.createGym("Cable Machine");
		System.out.println(name);
		
		name=Gym.createGym("Thread mill");
		System.out.println(name);
		
		Gym.getequipment();
		
		boolean updateItem = Gym.GymItemUpdate("Cable Machine" , "Crossing");
		Gym.getequipment();
		
		Gym.DeleteEquipment("Barbells");
		Gym.getequipment();
	}
}