package inheritance;

public class Mobile3
 {
	int price;
	String brand;
	Mobile3(int price)
	{
		this.price=price;
	}
	Mobile3(int price,String brand)
	{
		this(price);
		this.brand=brand;	
	}

}
