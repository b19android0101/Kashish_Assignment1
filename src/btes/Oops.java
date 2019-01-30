package btes;

import java.util.Scanner;

public class Oops {
int id;
String name;
float java_marks;
float apti_marks;
float avg;
Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops p=new Oops();
		p.data();
		p.avg();
		p.show();
	}
		void data()
		{
System.out.println("Enter name of student ");
name=s.nextLine();
System.out.println("Enter registration id ");
id=s.nextInt();
System.out.println("Enter java & aptitude marks ");
java_marks=s.nextInt();
apti_marks=s.nextInt();
	}
	void avg()
	{
		avg=(java_marks+apti_marks)/2;
	}
	void show()
	{
		System.out.println("Name is "+name);
		System.out.println("");
	}

}
