package practice;
import java.util.*;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int  i = 2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
	    boolean flag = false;
	    while (i <= num / 2) {
	     
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

	}
}

