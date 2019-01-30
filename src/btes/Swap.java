package btes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Swap {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	Swap() throws IOException
	{
System.out.println("Enter two numbers ");
a=Integer.parseInt(r.readLine());
b=Integer.parseInt(r.readLine());
	}
	void s()
	{
System.out.println("Before swapping  ");
System.out.println("A = "+a);
System.out.println("B = "+b);
c=a;
a=b;
b=c;
System.out.println("After swapping  ");
System.out.println("A = "+a);
System.out.println("B = "+b);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Swap a1=new Swap();
		a1.s();
	}

}
