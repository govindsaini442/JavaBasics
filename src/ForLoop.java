/*public class ForLoop
{
	public static void main(String args [])
	{
		System.out.println("For Loop Demo");
		for (int i =0; i <=10;i++)
		{
			System.out.println("For Loop Executed " +i + "time");
		}
	}
}

*/

/*

public class ForLoop
{
	public static void main(String args [])
	{
		System.out.println("For loop demo");
		
		int arr[] = {2,4,6,8,10};
		for(int i :arr)
		{
			System.out.println(i);
		}
	}
	
}*/

/*
// Labeled for loop 1
public class ForLoop
{
	public static void main(String args [])
	{
		System.out.println("Java labeled FOR loop demo");
		
		aa:
			for (int i=1;i<=3;i++)
			{
				bb:
					for (int j=1;j<=3;j++)
					{
						if (i ==2 && j ==2)
						{
							break aa;
						}
						System.out.println(i+" "+j);
					}		
			}
	}
}
*/

//Labeled for loop 2
public class ForLoop
{
	public static void main(String args [])
	{
		System.out.println("Java labeled FOR loop demo");
		
		aa:
			for (int i=1;i<=3;i++)
			{
				bb:
					for (int j=1;j<=3;j++)
					{
						if (i ==2 && j ==2)
						{
							break bb;
						}
						System.out.println(i+" "+j);
					}		
			}
	}
}