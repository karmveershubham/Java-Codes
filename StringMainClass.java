

import java.util.Scanner;

class StringMainClass {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in); 
        System.out.println("Enter a string:");
        String str = s.nextLine();
        int len=str.length();
        System.out.println("\nString Entered by user:\t" + str);
        System.out.println("Length of String:\t"+ len);
        s.close();
    }
    
}
