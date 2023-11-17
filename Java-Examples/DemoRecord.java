record Book (String name, String author, float price)
{
    //nothing here
}
class DemoRecord   //main class
{
	public static void main(String[] args){
		Book b1= new Book("java","Venktesh.v",235.6f);
		System.out.println(b1.toString());
	}
}
