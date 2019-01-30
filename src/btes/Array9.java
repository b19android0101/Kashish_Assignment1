package btes;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner t=new Scanner(System.in);
System.out.println("Enter two numbers ");
int x=t.nextInt();
int y=t.nextInt();
Array9  d=new Array9();
 System.out.println(d.sum(x, y));
 t.close();
	}
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	

}
