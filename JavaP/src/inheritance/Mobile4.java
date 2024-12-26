package inheritance;

public class Mobile4 
{
	String brand;
	int price;
	Mobile4(String brand)
	{
		this.brand=brand;
	}
	Mobile4(String brand,int price)
	{
		this(brand);
		this.price=price;
	}
	
	

}
