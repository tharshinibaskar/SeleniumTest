package methods;

public class Example1 {
	
	void M1()
	{
		System.out.println("intsane Metod");
		
	}
	
	static void M2()
	{
		System.out.println("StatiC Metod Metod");
	}
	public static void main(String[] args)
	{
		Example1 t1 = new Example1();
		t1.M1();
		Example1.M2();	
	}
}
