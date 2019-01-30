package btes;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number ");
		n=s.nextInt();
		i=n;
		for(j=1;j<=10;j++)
		{
			System.out.println(i+" "+ " * " +j+" = "+ (i*j));
		}
		s.close();
		
	}

}