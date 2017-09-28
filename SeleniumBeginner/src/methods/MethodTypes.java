package methods;

public class MethodTypes {
	static int a = 10;
	static int b =20;
	// Instance Method with static variable		
	void InstanceMethod(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	//Instance method with instance variable
	void InstanceMethod2(int c, int d)
	{
		int e = c+d;
		System.out.println(e);
	}
	
	public static void statMeth(int f,int g)
	{
		int h = f+g;
		System.out.println(h);
	}
	public static void main(String[]args)
	{
		MethodTypes InstMeth= new MethodTypes();
		InstMeth.InstanceMethod(a, b);
		InstMeth.InstanceMethod2(10,30);
		MethodTypes.statMeth(5, 5);
	}
}
