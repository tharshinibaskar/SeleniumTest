package methods;

public class StaticMethodTwoPara {
	static void M2(int a, char ch)
	{
		System.out.println(a);
		System.out.println(ch);
	}
	
	public static void main(String[]args)
	{
		
		StaticMethodTwoPara.M2(10, 'a');
	}
}
