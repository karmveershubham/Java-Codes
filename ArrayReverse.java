
import java.util.Scanner;
class ArrayReverse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int n=s.nextInt();
		int a[]=new int[n];
        int ra[]=new int[n];
        
        System.out.println("Enter the integer Elements");
        for(int i=0;i<=n-1;i++)
        {
        a[i]=s.nextInt();
        } 

        System.out.println("The reversed Array is: ");

        for(int i=0;i<n;i++)
        {
            ra[i]=a[n-1-i];
            System.out.print( ra[i] +" ");
        }
        s.close();
	}
}
