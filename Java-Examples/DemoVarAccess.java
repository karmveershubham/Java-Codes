import java.util.Scanner;

class DemoVariables {
	static int a;   // Primitive Data Type Class variable
	int b;          //instance variable
	void display()
	{
		int c=a+b;//Local Variable
		System.out.println(" a  is static "+a);
		System.out.println(" b  is instance "+b);
		System.out.println("c is local "+c);//local variable,memory while method execution
	}

}

class DemoVarAccess {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
		DemoVariables d=new DemoVariables();//object creation
		System.out.println("  enter value of a");
		DemoVariables.a=s.nextInt();// accessed with class name
		System.out.println("  enter value of b");
		d.b=s.nextInt();// accessed with object
		d.display();
        s.close();

    }
}
