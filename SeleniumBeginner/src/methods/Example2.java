package methods;

public class Example2 {
	
	void M1(int a,char c )
	{
		System.out.println("intsane Metod");
		System.out.println(a);
		System.out.println(c);
	}
	
	static void M2(String a, double d)
	{
		System.out.println("StatiC Metod Metod");
		System.out.println(a);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Example2 t1 = new Example2();
		t1.M1(2,'c');
		Example2.M2("abfg",10.5);	
	}
}
