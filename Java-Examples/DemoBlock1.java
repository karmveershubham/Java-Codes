
class Test1               //SubClass
{
	static 
	{
		System.out.println("Test Static block...");
	}

}

class DemoBlock1              //MainClass 
{
	public static void main(String[] args) 
	{
		Test1 ob1 = new Test1();
		System.out.println("Msg from standard main() method...");

	}
	static
	{
		System.out.println("MainClass Static block...");
	}
}

