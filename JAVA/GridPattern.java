
import java.util.Scanner;
class GridPattern {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print("_ ");
            }
            System.out.println("");
        }
        s.close();
    }  
}


