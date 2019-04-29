public class FunctionDemo 
{
	public static int minfunction(int n1,int n2)
	{
		System.out.println("minfunction called");
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}	
	public static void minfunction2(int x1,int x2)
	{
		System.out.println("minfunction2 called");
		
		if (x1 > x2)
			System.out.println("x1 is greater than x2");
		else if (x2 > x1)
			System.out.println("x2 is greater than x1");
		else if (x1 == x2)
			System.out.println("x1 is equal to x2");
	}
	public static void main(String args [])
	{		
		System.out.println("Function Demo");
		System.out.println("Min value is:" +FunctionDemo.minfunction(10, 20));
		FunctionDemo.minfunction2(22, 22);
		int finalmin = FunctionDemo.minfunction(10, 20);
		System.out.println(finalmin);
	}
}
