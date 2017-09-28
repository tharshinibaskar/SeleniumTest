package methods;

public class Example5 {
int a = 10;
int b =20;
	void M1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		
	}
	
	void M2(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args)
	{
		Example5 t1 = new Example5();
		t1.M1(30,50);
		t1.M2(40,50);	
	}
	
}
