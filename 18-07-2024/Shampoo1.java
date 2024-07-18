class Shampoo1
{
	String brandName;
	int quantity;
	double price;
	String mfgDate;
	String expDate;
	public boolean createBill(String brandName, int quantity, double price , String mfgDate , String expDate)
	{
      	boolean isCreated = false;
		if(brandName != null && quantity > 0 && price > 0.0 && mfgDate != null && expDate != null)
		{
		this.brandName = brandName;
		this.quantity = quantity;
		this.price = price;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		isCreated = true ; 
	    }return isCreated ; 
	}
	public void displayShampooInfo()
	{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("The brandName is: "+ this.brandName);
		System.out.println("The quantity we need is: "+ this.quantity);
		System.out.println("The price of shampoo is: "+ this.price);
		System.out.println("The mfgDate is: "+ this.mfgDate);
		System.out.println("Is expDate is: "+ this.expDate);
	}
}