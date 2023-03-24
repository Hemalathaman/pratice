package practice;
import java.util.*;

public class Swap2 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a variable:");
	int a=sc.nextInt();
    System.out.println("enter b variable:");
	int b=sc.nextInt();
	int c;
	c=a;
	a=b;
	b=c;

	System.out.println("A value:"+a);
	System.out.println("B value:"+b);
	}

}
