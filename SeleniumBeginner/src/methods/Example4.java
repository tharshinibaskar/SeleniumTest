package methods;

public class Example4 {
	
	void M1()
	{
		System.out.println("intsane Metod");
		M2();//Inner calss method 
	}
	
	static void M2()
	{
		System.out.println("StatiC Metod Metod");
	}
	public static void main(String[] args)
	{
		Example4 t1 = new Example4();
		t1.M1();
		Example4.M2();	
	}
	

}
