package inheritance;

public class Test12345 
 {
	public static void main(String[] args)
	{
		Bar1 a2=new Bar1("Tania");
		System.out.println(a2.name);
        System.out.println(a2.b1.brand);
		System.out.println(a2.b1.a1.color);
	}
	

}
