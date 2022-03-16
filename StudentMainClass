import java.util.Scanner;

class Student
{
    Scanner s=new Scanner (System.in); 
    String sName, sBranch, sRollno;
    int sTotalMarks;
    int a[]=new int[6];

    void getSDetails()
    {
        System.out.print("Enter your name.:");
        sName=s.nextLine();

        while(true){
            System.out.print("Entr your Roll Number.:");
            String Roll=s.nextLine();
            if (Roll.length()==10) 
            {
                sRollno=Roll;
                break;
            }
            else
            {   
                System.out.println("Invalid Input. Roll Number must be Of 10 characters.");
                continue;
            }
        }
    }

    void getSBranch()
    {
        System.out.print("Enter the Branch Name:");
        String ch=s.nextLine();
        switch(ch)
        {
            case "CSE":
                sBranch="CSE";
                break;
            
            case "EEE":
                sBranch="EEE";
                break;
            
            case "ECE":
                sBranch="ECE";
                break;
            
            
            case "BCA":
                sBranch="BCA";
                break;
            
            case "MEC":
                sBranch="MEC";
                break;

            default:
            System.out.println("Invalid input.");
        }
    }

    void getSMarks()
    {
        while(true)
        {
            System.out.println("\nEnter the Marks of Six Subjects {S1,S2,S3,S4,S5,S6} respectively.");

            for (int i=0;i<=5; i++)
                {
                    a[i] =s.nextInt();
                }
        }
    }


    void DisplaySDetails()
    {
        System.out.println("\nStudent's Name:  \t "+ sName);
        System.out.println("Student's Roll No:\t "+ sRollno);
        System.out.println("Student's Branch:\t "+sBranch+ "\n");

    }

    void displaySMarks()
    {
        for(int i=0;i<(6); i++)
        {
            System.out.println("Marks of subject S"+ (i+1) +" is: \t"+ a[i]) ;
        }

    }

    void displaySRemarks()
    {
        int sum=0;
        for(int i=0;i<=5;i++)
        {
            sum+=a[i];
        }
        float percentage=sum/6;
        System.out.println("\nPercentage Scored:\t"+percentage );

        if (percentage>=90 && percentage<=100) {
            System.out.println("Remarks: Excellent");		
        }
        else if (percentage>=80 && percentage<90) {
            System.out.println("Remarks: Very Good");
        }
        else if (percentage>=60 && percentage<80){
            System.out.println("Remarks: Good");
        }  
        else if (percentage>=40 && percentage<60){
            System.out.println("Remarks: Average");
        }
        else if (percentage>=40 && percentage>=0) {
            System.out.println("Remarks: Fails");
        }
        else{
            System.out.println("Invalid Marks Input");
        }

    }
}


class StudentMainClass 
{
    public static void main (String args[])
    {
        Student s=new Student();
        s.getSDetails();
        s.getSBranch();
        s.getSMarks();
        System.out.println("\n==========DISPLAY OF STUDENT DETAILS.===========\n");
        s.DisplaySDetails();
        System.out.println("\n===========DISPLAY OF STUDENT MARKS.============\n");
        s.displaySMarks();
        System.out.println("\n===DISPLAY OF STUDENT PERCENTAGE AND REMARKS.===\n");
        s.displaySRemarks();

    }
    
}
