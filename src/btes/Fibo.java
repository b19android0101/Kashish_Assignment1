package btes;

import java.util.Scanner;

public class Fibo {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a=0,b=1,c;
	System.out.println("Enter the number ");
	int n=s.nextInt();
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	s.close();
	}
	
}
