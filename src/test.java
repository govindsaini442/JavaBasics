import java.util.Scanner;
public class test 
{	
	int i;
	int j;
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	public static void main(String args [])
	{
		System.out.println("getter setter demo");
		test t1 = new test();
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		t1.setI(input1);
		t1.setJ(input2);
		System.out.println(t1.getI());
		System.out.println(t1.getJ());
	}

}
