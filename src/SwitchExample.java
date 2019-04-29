import java.util.Scanner;

/*import java.util.Scanner;
public class SwitchExample 
{
	public static void main(String args [])
	{
		System.out.println("Switch statement demo");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		switch(number)
		{
		case 5:
			System.out.println("Value is " +number);
			break;
		case 10:
			System.out.println("Value is " +number);
			break;
		case 20:
			System.out.println("Value is " +number);
			break;
		default:
			System.out.println("Value is not under above case");
		
		}
	}

}
*/

// finding month from switch statement

/*
import java.util.Scanner;
public class SwitchExample
{
	public static void main(String args [])
	{
		System.out.println("Finding Months using switch statement");
		System.out.println("Enter value of month in number :");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String monthString = "";
		switch(month)
		{
		case 1:monthString="1 - Jan";
		System.out.println(monthString);
		break;
		case 2: monthString="1 - Feb";
		System.out.println(monthString);
		break;
		case 3: monthString="1 - Mar";
		System.out.println(monthString);
		break;
		case 4: monthString="1 - Apr";
		System.out.println(monthString);
		break;
		case 5: monthString="1 - May";
		System.out.println(monthString);
		break;
		case 6: monthString="1 - June";
		System.out.println(monthString);
		break;
		case 7: monthString="1 - July";
		System.out.println(monthString);
		break;
		case 8: monthString="1 - Aug";
		System.out.println(monthString);
		break;
		case 9: monthString="1 - Sep";
		System.out.println(monthString);
		break;
		case 10: monthString="1 - Oct";
		System.out.println(monthString);
		break;
		case 11: monthString="1 - Nov";
		System.out.println(monthString);
		break;
		case 12: monthString="1 - Dec";
		System.out.println(monthString);
		break;
		default:
			System.out.println("Invalid month");
		}
		
	}
	
}*/

//Finding weekday name from Switch statement
public class SwitchExample
{
	String weekenglish = "";
	void setday(String weekenglish)
	{
		this.weekenglish = weekenglish;
	}
	String getday()
	{
		return weekenglish;
	}
	public static void main(String args [])
	{
		SwitchExample sw = new SwitchExample();
		System.out.println("finding week name from Switch statement");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number: ");
		int daynumber = sc.nextInt();
		String weekenglish = "";
		switch(daynumber)
		{
		case 1: weekenglish = "Sunday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());	
			break;
		case 2: weekenglish = "Monday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		case 3: weekenglish = "Tuesday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		case 4: weekenglish = "Wednesday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		case 5: weekenglish = "Thursday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		case 6: weekenglish = "Friday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		case 7: weekenglish = "Saterday";
			sw.setday(weekenglish);
			System.out.println(sw.getday());
			break;
		default:
			System.out.println("Invalid day");	
		}
	}
	
}