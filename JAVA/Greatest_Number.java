

class Greatest_Number 
{
    public static void main (String args[])
    {
        float n1=7.5f;
        float n2=56.6f;
        float n3=65.32f;

        
        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println("\nThe greaest number is: "+n1+"\n");
            else
                System.out.println("\nThe greaest number is: "+n3+"\n");
        }
        else {
            if (n2 >= n3)
                System.out.println("\nThe greaest number is: "+n2+"\n");
            else
                System.out.println ("\nThe greaest number is: "+n3+"\n");
        }
    }

    
}
