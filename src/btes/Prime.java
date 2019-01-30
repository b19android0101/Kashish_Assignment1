package btes;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
boolean flag;
for(i=1;i<100;i++)
{
	flag=true;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=false;
			break;
		}
	}
		if(flag==true)
		{
			System.out.println(i);
		}
	
}
	}

}
