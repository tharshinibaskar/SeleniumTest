package variables;

public class StaticVariable {
	
	static int a = 100;
	static int b = 100;
	public static void main (String[] args){
	System.out.println(StaticVariable.a);
	System.out.println(StaticVariable.b);
	m1();
	StaticVariable t = new StaticVariable();
	t.m1();
	}
	
	public static void m1()
	{
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.b);
	}
}
