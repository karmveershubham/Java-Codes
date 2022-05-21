
class Calculator {
    public static void main (String args[]) {
        
        char operator= '/';
        int a=65;
        int b=10;
        int c;


        switch(operator){ //switch (Matching case or expression)

            case '+':
                c=a+b;
                System.out.println("The sum of " + a + " and " + b +" is : " + c);
                break;

            case '-':
                c=a-b;
                System.out.println("The subtraction of " + b + " from " + a +" is : " + c );
                break;

            case '*':
                c=a*b;
                System.out.println("The Multiplication " + a + " and " + b +" is : " + c);
                break;

            case '/':
                c=a/b;
                System.out.println("The division of " + a + " by " + b +" is : " + c);
                break;

            default:
                System.out.println("Invalid Input");

        }

    }
    
}


