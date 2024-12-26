package inheritance;

public class Test4 {
	public static void main(String[] args) 
	{
	Vachicle v=new Vachicle(1234);
	System.out.println(v instanceof Vachicle);
	System.out.println(v instanceof Bike);
	Bike b=new Bike(234,"Blue");
	System.out.println(b instanceof Vachicle);
	System.out.println(b instanceof Bike);
	
	}

}
