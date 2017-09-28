package methods;

public class Example6 {
	int M1(int a, int b)
	{
		System.out.println(a+b);
		return b;
		
	}
	
	public static void main(String[] args)
	{
		Example6 t1 = new Example6();
		int c = t1.M1(10,2);
		System.out.println(c);
	}
	
}
