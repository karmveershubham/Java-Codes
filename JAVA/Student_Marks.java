
class Student_Marks 
{
    public static void  main (String args[])
    {
        int marks=86;

        if (marks>=90 && marks<=100) {
            System.out.println("Student got A+ Grade.");		
        }
        else if (marks>=80 && marks<90) {
            System.out.println("Student got A Grade.");
        }
        else if (marks>=70 && marks<80) {
            System.out.println("Student got B Grade.");	
        }
        else if (marks>=60 && marks<70){
            System.out.println("Student got C Grade.");
        }
        else if (marks>=50 && marks<60){
            System.out.println("Student got D Grade.");
        }
        else if (marks>=50 && marks>=0) {
            System.out.println("Student Failed.");
        }
        else{
            System.out.println("Invalid Marks Input");
        }

    }

}
