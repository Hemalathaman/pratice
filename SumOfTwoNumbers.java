package practice;

public class SumOfTwoNumbers {
	 static int add(int a, int b)
	    {
	       
	        for (int i = 1; i <= b; i++)
	            a++;
	        return a;
	    }
	 
	    public static void main(String[] args)
	    {
	        
	        int a = add(10, 78);
	        System.out.print(a);
	    }

}
