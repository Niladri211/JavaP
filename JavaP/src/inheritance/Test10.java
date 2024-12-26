package inheritance;

public class Test10 
 {
	public static void main(String[] args) 
	 {
		Mobile3 m1=new Mobile3(10);
		System.out.println(m1.price);
		Mobile3 m2=new Mobile3(10,"Usha");
	   System.out.println(m2.price);
	   System.out.println(m2.brand);
	}

}
