package bittu;

public class HelloWorld2 {

	public static void main(String[] args) {
		HelloWorld2 i1 = new HelloWorld2();
		System.out.println(i1.add(2, 3));
		System.out.println("Bittu");
		System.out.println(i1.getName("Bittu"));
		i1.getName("Bittu");
		i1.printName();
	}
	
	void printName()
	{
		System.out.println("Hello World!");
	}
	
	String getName(String name)
	{
		return "Hello " + name + "!";
	}
	
	int add(int a, int b)
	{
		return a + b;
	}
}
