package Abstraction;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner (System.in);
		  System.out.println("Enter 2 number");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  Application a1 =new Calculator();
		  System.out.println(a1.add(a, b));

	}
}
