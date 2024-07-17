class TextilesRunner
{
	public static void main(String [] material)
	{
		boolean Name = Textiles.Materials("SHINY FABRIC");
		System.out.println(Name);

		Name = Textiles.Materials("Polystar");
		System.out.println(Name);
		
		Name = Textiles.Materials("Organza");
		System.out.println(Name);
		
		Name = Textiles.Materials("Net");
		System.out.println(Name);
		
		Name = Textiles.Materials("Linen");
		System.out.println(Name);
		
		Name = Textiles.Materials("Treated ");
		System.out.println(Name);
		
		Name = Textiles.Materials("Cotton");
		System.out.println(Name);
		
		Name = Textiles.Materials("Wollen");
		System.out.println(Name);
		
		Name = Textiles.Materials("Rayon");
		System.out.println(Name);
		
		Name = Textiles.Materials("Georgate");
		System.out.println(Name);
		
		Name = Textiles.Materials("Art Silk");
		System.out.println(Name);
		
		Name = Textiles.Materials("Chiffon");
		System.out.println(Name);
		
		Name = Textiles.Materials("Crepe");
		System.out.println(Name);
		
		Name = Textiles.Materials("Jute");
		System.out.println(Name);
		
		Textiles.getAllMaterialinfo();
		
		boolean updateName = Textiles.updateTexture("Art Silk" , "Satin");
		System.out.println(updateName);
		
		Textiles.getAllMaterialinfo();
		
		Textiles.deleteMaterialBrand("Chiffon");
		Textiles.getAllMaterialinfo();
	}
}