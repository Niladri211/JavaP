package inheritance;

public class Test3
{
	public static void main(String[] args)
	{
		Vivo v1=new Vivo("amulate","Vivo21");
		System.out.println(v1.display);
		System.out.println(v1.brand);
		Mobile2 m1=v1;
		System.out.println(m1.display);
		Vivo v2=(Vivo)v1;
		System.out.println(v2.display);
		System.out.println(v2.brand);
	}
}