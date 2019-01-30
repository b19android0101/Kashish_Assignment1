package btes;
import java.util.Scanner;
class Great2
{
public static void main(String args[])
{
int a,b,c;
Scanner inp=new Scanner(System.in);
System.out.println("Enter three numbers");
a=inp.nextInt();
b=inp.nextInt();
c=inp.nextInt();
if((a>b)&&(a>c))
{
System.out.println("A is greatest");
}
else if((b>c)&&(b>a))
{
System.out.println("B is greatest");
}
else if((c>a)&&(c>b))
{
System.out.println("C is greatest");
}
inp.close();
}
}



