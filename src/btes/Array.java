package btes;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[4];
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter elements of array ");
for(i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
System.out.println("Elements are ");
for(i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
s.close();
	}

}
