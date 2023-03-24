package practice;
import java.util.*;

public class Power2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base=sc.nextInt();
		System.out.println("Enter the exponent  value:");
		int exponent=sc.nextInt();
		int result=1;
		while(exponent!=0)
		{
			result=result*base;
			 --exponent;
		}
		System.out.println("The power is :"+result);
		
		
	}

}
