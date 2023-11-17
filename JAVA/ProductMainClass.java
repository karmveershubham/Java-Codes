
import java.util.Scanner;

class Product
{
String pName,pCode;
float price;
int pQty; 
void getProduct()
{
	System.out.println(" Product Name :"+pName);
	System.out.println(" Product Code :"+pCode);
		System.out.println(" Product Price:"+price);
		System.out.println("Product Quantity"+pQty);	
}
}


class ProductMainClass 
{
	public static void main(String args[])
	{
		Product p= new Product();
		Scanner s=new Scanner(System.in);//object creation for Scanner  Class and linking from console
        
		System.out.println("Enter Product Name");
		p.pName=s.nextLine();
		
		System.out.println("Enter Product Price");
		p.price=Float.parseFloat(s.nextLine());   //example
		System.out.println("Enter Product Code");
		p.pCode=s.nextLine();
		System.out.println(" Enter Product Quantity");
		p.pQty=s.nextInt();
		p.getProduct();
        s.close();
		
	}	
}
