package polymorphism;

public class Test2
//Constructor Overloading
 {
	public static void main(String[] args) {
		
		Mobile m1=new Mobile(1230);
		System.out.println(m1.price);
		Mobile m2=new Mobile(1234,"Nokia");
		System.out.println(m2.price);
		System.out.println(m2.name);
	}
	

}
