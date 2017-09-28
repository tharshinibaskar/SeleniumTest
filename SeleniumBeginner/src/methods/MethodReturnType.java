package methods;

public class MethodReturnType {
	// Method without return type & without argument
	double salary;
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

	// Method without return type with argument
	
	public void sum(int a, int b)
	
	{
	int c = a+b;
	System.out.println(c);
	}
	// Method with return type without arguments

	public int  summation()
	{
		int a = 10;
		int b =20;
		int c = a+b;
		return c;
	}
	
	//Method with return type with argument
	
	public int total(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	// User defined method where all the methods are called
	public  void display()
	{
		MethodReturnType mathcal = new MethodReturnType();
		mathcal.add();
		mathcal.sum(10, 10);
		int b = mathcal.total(5, 10);
		System.out.println(b);
		int c = mathcal.summation();
		System.out.println(c);
		int d = mathcal.total(10, 10);
		System.out.println(d);
		
	}
	
	// Main Method where the excution starts
	public static void main(String[]args)
	{
		MethodReturnType mathcal = new MethodReturnType();
		/*mathcal.add();
		mathcal.sum(10, 10);
		System.out.println(mathcal.summation());
		System.out.println(mathcal.total(10, 20));*/
		mathcal.display();
	}
}
