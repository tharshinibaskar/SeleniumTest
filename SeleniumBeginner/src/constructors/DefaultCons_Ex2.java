package constructors;

public class DefaultCons_Ex2 {
	// Here the constructor is not created, compiler by itself create the consturtor and run the deacon method
	String name;
	int b;
	
	void Defcon()
	{
		System.out.println(name);
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		DefaultCons_Ex2 obj1 = new DefaultCons_Ex2();
		obj1.Defcon();	
	}

}
