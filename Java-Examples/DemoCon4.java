class CTest3                    //SubClass
{

    CTest3()
	{
		System.out.println("=====Constructor====");
	}

    {
		System.out.println("====Instance block====");
	}

    static
	{
		System.out.println("====Static block====");
	}
}
class DemoCon4                 //MainClass 
{
    static    //executed automaticcaly when clas loaded.
    {
        System.out.println("====Static block (Main Class)====");
    }

    
    {
		System.out.println("====Instance block(Main class)====");
	}

	public static void main(String[] args) 
	{
        CTest3 ob = new CTest3();             //Constructor call
        //DemoCon4 obj = new DemoCon4();      //object created for instance block to be executed
        
    {
		System.out.println("====Instance block Main method====");
	}

	}
}
