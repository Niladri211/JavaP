package inheritance;

public class Mobile 
{

	int price;
	String color;
	public Mobile(int price,String color)
	{
		this.price=price;
		this.color=color;
	}
	public static void main(String[] args)
	{
		Mobile m1=new Mobile(15000,"Vivo");
		Mobile m2=new Mobile(150000,"Apple");
		System.out.println(m1.price);
		System.out.println(m1.color);
		System.out.println(m2.price);
		System.out.println(m2.color);
	}
}
