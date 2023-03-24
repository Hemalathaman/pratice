package practice;
import java.util.*;

public class Power1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base=sc.nextInt();
		System.out.println("Enter the exponent value:");
		int exponent=sc.nextInt();
		

	   
	    double result = Math.pow(base, exponent);

	    System.out.println("Answer = " + result);
	}
}
