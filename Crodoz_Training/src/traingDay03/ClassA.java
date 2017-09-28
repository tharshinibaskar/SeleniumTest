package traingDay03;

public class ClassA {
	 int a = 10;
	 int b = 20;

	public ClassA()
	{
		int a;
		int b;
		this.a = 30; // This keword must be used if constructor is defined,This will assign the value to int a
		this.b = 40;
	}
	public void m1()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[]args)
	{
		ClassA obj1 = new ClassA();
		obj1.m1();
	}

}
