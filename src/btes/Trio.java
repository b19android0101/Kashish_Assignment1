package btes;

import java.util.Scanner;

public class Trio {
		public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c=1,d;
		System.out.println(a+" "+b+ " "+c);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			d=a+b+c;
			System.out.println(c);
			a=b;
			b=c;
			c=d;
		}
		s.close();
		
		}
	}


