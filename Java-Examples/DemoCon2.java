class CTest2              //SubClass
{
    CTest2(int x)
    {
        System.out.println("====Constructor CTest2()====");
        System.out.println("The value x:"+x);
    }

	void dis(int y)
	{
		System.out.println("====Method dis()====");
		System.out.println("The value y:"+y);
	}
}
class DemoCon2          //MainClass 
{
	public static void main(String[] args) 
	{
		CTest2 ob = new CTest2(122);               //Constructor_Call
        ob.dis(123);                               //Method_call
	}
}
