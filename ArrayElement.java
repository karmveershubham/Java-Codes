
// Write a Java program to find the index of an array element.
import java.util.Scanner;

class Block {

}

class ArrayElement 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);  
        System.out.println("Enter array size: ");
        int b=Integer.parseInt(s.nextLine());
        String a[]=new String[b];
        System.out.println("Enter the Elements.");
        for (int i=0;i<=(b-1); i++)
        {
            a[i] =s.nextLine();
        }
        {
        System.out.println("Enter the Element to get it's index in array.");
        String Element = s.nextLine();

        System.out.println(Element);
        for(int i=0; i<b; i++)
        {
            if(a[i]==Element){
                System.out.println("The index of "+ Element +" in array is: "+ i );
            }
        }
        }
        s.close();
    }    
}
