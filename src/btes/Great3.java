package btes;
import java.util.Scanner;
class Great3
{
public static void main(String args[])
{
int a,b,c,d;
Scanner i=new Scanner(System.in);
System.out.println("Enter three numbers");
a=i.nextInt();
b=i.nextInt();
c=i.nextInt();
d=a>b?(a>c?a:c):(b>c?b:c);
System.out.println("Greatest number is "+d);
i.close();
}
}
