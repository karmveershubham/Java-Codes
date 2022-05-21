

import java.util.Scanner;

class BookDetails
{
String bTitle, bLanguage ,bEdition;
int bTotalPages,bPrice, bQuantity;
void getBookDetails()
{
System.out.println("Book Name: "+bTitle);
System.out.println("Book Price: "+bPrice);
System.out.println("Book Edition: " +bEdition);
System.out.println("Book's Language: "+ bLanguage);
System.out.println("Total Quantity: "+bQuantity);
System.out.println("Total Pages: " +bTotalPages+"\n");
}
}

class BookDescription
{
String bISBNCode,bAuthor,bPublisher,bCategory;
void getbookDesc()
{
System.out.println("Book ISBN code: "+bISBNCode);
System.out.println("Book Author Name: " +bAuthor);
System.out.println("Book Publisher Name: " +bPublisher);
System.out.println("Book's Category: " +bCategory);
}
}

class BookMainClass
{
public static void main(String args[])
{
    BookDetails bds = new BookDetails();
    BookDescription bdn = new BookDescription();

    Scanner s = new Scanner(System.in); 
    System.out.println("Enter Book Title: ");
    bds.bTitle = s.nextLine();
    System.out.println("Enter Book Price: ");
    bds.bPrice =Integer.parseInt(s.nextLine());
    System.out.println("Enter Book Edition: ");
    bds.bEdition =s.nextLine();
    System.out.println("Enter Book Language: ");
    bds.bLanguage=s.nextLine();
    System.out.println("Enter Book Quantity: ");
    bds.bQuantity =Integer.parseInt(s.nextLine());
    System.out.println("Enter Book total pages: ");
    bds.bTotalPages=Integer.parseInt(s.nextLine());
    System.out.println("\nDetails of Book\n");
    bds.getBookDetails();

    System.out.println("\nEnter Book ISBN code: ");
    bdn.bISBNCode=s.nextLine();
    System.out.println("Enter Book Author: ");
    bdn.bAuthor=s.nextLine();
    System.out.println("Enter Book publisher: ");
    bdn.bPublisher=s.nextLine();
    System.out.println("Enter Book category: ");
    bdn.bCategory=s.nextLine();
    System.out.println("\nDescription of Book:\n ");
    bdn.getbookDesc();

    s.close();
}
}
