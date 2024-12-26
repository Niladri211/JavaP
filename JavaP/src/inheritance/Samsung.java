package inheritance;

public class Samsung extends Mobile1
{
String display;
Samsung(String brand,int price,String display)
{
	super(brand,price);
	this.display=display;
}
}
