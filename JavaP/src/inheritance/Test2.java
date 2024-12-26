package inheritance;

public class Test2 {
	public static void main(String[] args) {
		Apple a=new Apple("Iphone 13",100,"pink");
		System.out.println(a.brand);
		System.out.println(a.price);
		System.out.println(a.color);
		Samsung s=new Samsung("sumsung a50",19,"Amulate");
		System.out.println(s.brand);
		System.out.println(s.price);
		System.out.println(s.display);
	}

}
