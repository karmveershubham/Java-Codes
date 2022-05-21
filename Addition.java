
import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two Numbers");
			int a,b,c;
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("\nThe first value:"+ a );
			System.out.println("The second Value:"+ b );
			System.out.println("\nThe result of addition of "+a+" and "+b+" is "+c+"\n" );
		} 



	}
}
