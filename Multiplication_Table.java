

class Multiplication_Table   //Using For loop
{
    public static void main (String args[])
    {
        int res;

        int i;
        int num1=10;
        System.out.println("\nMultiplication Table of "+num1+" using for loop is: \n");
        for (i=1;i<=10;i++)
        {
            res=num1*i;
            System.out.println(num1+" X " +i+ " = "+ res);
        }

        int j=1;
        int num2=5;
        System.out.println("\nMultiplication Table of "+num2+" using While loop is: \n");
        while (j<=10)
        {
            res=num2*j;
            System.out.println(num2+" X " +j+ " = "+ res);
            j++;
        }

        int k=1;
        int num3=2;
        System.out.println("\nMultiplication Table of "+num3+" using do While loop is: \n");
        do
        {
            res=num3*k;
            System.out.println(num3+" X " +k+ " = "+ res);
            k++;
        } while(k<=10);


    }
    
}
