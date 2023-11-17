public class WrapperClass {
	@SuppressWarnings("removal")              //java Annotations
	public static void main(String[] args) {
         //Boxing process
		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer("13");
		System.out.println("ob1:"+ob1.toString());
		System.out.println("ob2:"+ob2.toString());
	}
}
