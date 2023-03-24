package practice;
import java.util.*;

public class SimpleIntrest {
	public static void main(String[] args)
	{
		float p,t,r;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter p value:");
	  p=sc.nextFloat();
	  System.out.println("Enter t value:");
	  t=sc.nextFloat();
	  System.out.println("Enter r value:");
	  r=sc.nextFloat();
	  float s=p*t*r/100;
	  System.out.println("Simple interst:"+s);
	  
	  
	}

}
