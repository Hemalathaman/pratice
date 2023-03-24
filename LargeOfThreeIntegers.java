package practice;
import java.util.*;

public class LargeOfThreeIntegers {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a =sc.nextInt();
	System.out.println("Enter b number:");
	int b=sc.nextInt();
	System.out.println("Enter c number:");
	int c=sc.nextInt();
	if(a>b &&a>c)
	{
		System.out.println("A is greater than b and c");
	}
	else if(b>a && b>c)
	{
		System.out.println("B is greater than c and d");
	}
	else if(c>a && c>b)
	{
		System.out.println("C is greater than a and b");
	}
	
}
}
