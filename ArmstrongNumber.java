package practice;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args)
	 {int orginalNumber, rem, result = 0;
	 Scanner sc = new Scanner(System.in);
	 int no = sc.nextInt();
	 orginalNumber = no;
	 while (orginalNumber != 0) 
	 {rem = orginalNumber % 10;
	 result += Math.pow(rem, 3);
	 orginalNumber = orginalNumber / 10;
	 }if (result == no)
	 System.out.println(no + " is an Armstrong number.");
	 else
		 System.out.println(no + " is not an Armstrong number.");}

	{

	}

}
