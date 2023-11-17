

import java.util.Scanner;
class ReverseString {
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String.:  ");
        String str=s.nextLine();
        int len=str.length();

		char a[]=new char[len];

        for(int i=0;i<len;i++)
        {
        a[i]=str.charAt((len-1)-i);
        }

        System.out.print("\nThe reversed string is.:  ");
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i]);
        }
        s.close();
	}
}
