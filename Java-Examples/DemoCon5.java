
import java.util.Scanner;

class Product                    //SubClass
{
	String pCode,pName;
	float pPrice;
	int pQty;             //Instance variables memory in Object

    Product(String pCode,String pName,float pPrice,int pQty)  //Formal parameter
    {                                                           
        this.pCode = pCode;            //pCode,pName,pPrice and pQty are local variables 
		this.pName = pName;
        this.pPrice = pPrice;
	   	this.pQty = pQty;                 //Loading data from Local variables to Instance variables
    }                                                            
    void getProduct()
    {
        System.out.println("PCode:"+pCode);
        System.out.println("PName:"+pName);
        System.out.println("PPrice:"+pPrice);
        System.out.println("PQty:"+pQty);
    }
}
class DemoCon5                //MainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ProdCode:");
		String pC = s.nextLine();
        System.out.println("Enter the ProdName:");
		String pN = s.nextLine();
        System.out.println("Enter the ProdPrice:");
		float pP = s.nextFloat();
        System.out.println("Enter the ProdQty:");
		int pQ = s.nextInt();                                                //pC,pN,pP and pQ are Local variables
		Product p1 = new Product(pC,pN,pP,pQ); 
        Product p2 = new Product(pC,pN,pP,pQ);                               //Con_call  ;//Actual parameter
		p1.getProduct();// method calling
        p2.getProduct();
        s.close();
	}
}
