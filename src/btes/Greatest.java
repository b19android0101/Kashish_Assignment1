package btes;
import java.util.Scanner;
class Greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner inp=new Scanner(System.in);
System.out.println("Enter three numbers");
a=inp.nextInt();
b=inp.nextInt();
c=inp.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("A is greatest");
}
else
{
System.out.println("C is greatest");
}
}
if(b>c)
{
if(b>a)
{
System.out.println("B is greatest");
}
else
{
System.out.println("C is greatest");
}
}
inp.close();
}
}



