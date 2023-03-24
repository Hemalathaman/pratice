package practice;


import java.util.*;

class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,m;
		int org=n;
		while(org!=0)
		{
			m=org%10;
			r=r*10+m;
			org=org/10;
		}
		if(r==n)
		   System.out.println("It is a palindrome number");
		else
			System.out.println("It is not a palindrome number");
	}

}
