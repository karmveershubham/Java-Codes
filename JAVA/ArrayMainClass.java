
import java.util.Scanner;

class ArrayMainClass
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in); 
        System.out.println("Enter array size: ");
        int b=Integer.parseInt(s.nextLine());
        String a[]=new String[b];
        System.out.println("Enter the collection of character");
        for (int i=0;i<=(b-1); i++)
        {
            a[i] =s.nextLine();
        }

        int len=a.length;
        System.out.println("\nLength of collection of character:\t"+len+"\n\n=========Traversal=========\n");

        for(int i=0;i<(b); i++)
        {
            System.out.println("Collection of character\t"+a[i]);
        }
        s.close();
    }
}
