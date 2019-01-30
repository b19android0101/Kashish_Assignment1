package btes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Practice {

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		int a,b,c,d;
BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter three numbers ");
a=Integer.parseInt(f.readLine());
b=Integer.parseInt(f.readLine());
c=Integer.parseInt(f.readLine());
d=a+b+c;
System.out.println("Sum is "+d);
	}
}
