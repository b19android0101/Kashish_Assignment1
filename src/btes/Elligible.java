package btes;
import java.util.Scanner;
class Elligible
{
public static void main(String args[])
{
int age;
String gender;
Scanner i=new Scanner(System.in);
System.out.println("Enter your gender");
gender=i.nextLine();
System.out.println("Enter your age");
age=i.nextInt();
if(gender.equals("Female"))
{
if(age>=18)
{
System.out.println("Eligible for marriage");
}
else{
System.out.println(" Not Eligible for marriage");
}
}
else{
if(age>=21)
{
System.out.println("Eligible for marriage");
}
else{
System.out.println(" Not Eligible for marriage");
}
}
i.close();
}
}