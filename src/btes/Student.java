package btes;

public class Student {
int id;
String name;
Student(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(11,"ABC");
Student s2=new Student(22,"XYZ");
s1.display();
s2.display();
	}

}
