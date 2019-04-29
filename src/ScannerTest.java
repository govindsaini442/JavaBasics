import java.util.Scanner;
public class ScannerTest 
{
	public static void main(String args [])
	{
		System.out.println("User Input Demo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of X:");
		int x = sc.nextInt();
		System.out.println("Value of X:" +x);
	}
}
