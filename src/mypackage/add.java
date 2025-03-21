package mypackage;
import java.util.Scanner;
public class add 
{
	public void main()
	{
		int a,b,c; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number=");
		a=sc.nextInt();
		System.out.println("Enter Second number=");
		b=sc.nextInt();
	     c=a+b;
	     System.out.println("Addition="+c);
	}

	public static void main(String[] args) 
	{
		add a=new add();
		a.main();
	}

}
