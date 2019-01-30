package btes;
import java.util.Scanner;
class Facto
{
public static void main(String args[])
{
int n,f=1;
Scanner inp=new Scanner(System.in);
System.out.println("Enter the number");
n=inp.nextInt();
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("Factorial is "+f);
inp.close();
}
}
