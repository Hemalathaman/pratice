package practice;
import java.util.*;
public class LeapYeat {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a =sc.nextInt();
		if(a%4==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
	}

}
