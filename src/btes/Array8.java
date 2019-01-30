package btes;

import java.util.Scanner;

public class Array8 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int [][] a=new int[3][2];
	int i,j;
	Scanner t=new Scanner(System.in);
	System.out.println(" Enter elements of array ");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
		a[i][j]=t.nextInt();
		}	}
	int min=a[0][0];
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			if (a[i][j]<min)
			{
				min=a[i][j];
			}}}
		System.out.println(min);
	t.close();
	}

}
