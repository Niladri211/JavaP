package inheritance;

public class Test12 
 {
	public static void main(String[] args)
	{
		Jio o1=new Jio("Jio22",1231);
		System.out.println(o1.brand);
		System.out.println(o1.price);
		Mobile5 m1=o1;
		System.out.println(m1.brand);
		Jio o2=(Jio)m1;
		System.out.println(o2.brand);
		System.out.println(o2.price);
	}

}
