public class ifelsedemo 
{
	public static void main(String args [])
	{
		System.out.println("If else test demo");
		int age = 20;
		int weight = 40;
		if (age > 15)
		{
			// nested if statement
			if (weight > 40)
				System.out.println("You are ok to donate blood");
			else
				System.out.println("You are not allowed to donate blood");
		}
	}

}
