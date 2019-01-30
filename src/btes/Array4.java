package btes;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a=new int[5];
	int min,i;
	Scanner t=new Scanner(System.in);
	System.out.println("Enter elements of array ");
	for(i=0;i<a.length;i++)
	{
		a[i]=t.nextInt();
	}
	min=a[0];
	for(i=1;i<a.length;i++)
	{
	if(a[i]<min)
	{
	min=a[i];	
	}
		}
	System.out.println(min);
	t.close();
		}
}

