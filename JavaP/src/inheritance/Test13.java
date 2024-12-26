package inheritance;

public class Test13 
 {
	public static void main(String[] args)
	{
		Vahical v= new Vahical(1231);
		System.out.println(v instanceof Vahical);
		System.out.println(v instanceof Bike2);
		Bike2 b1=new Bike2(123,"blue");
		System.out.println(v instanceof Vahical);
		System.out.println(v instanceof Bike2);
	}

}
