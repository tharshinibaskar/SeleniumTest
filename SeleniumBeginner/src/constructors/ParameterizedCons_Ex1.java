package constructors;

public class ParameterizedCons_Ex1 {

	ParameterizedCons_Ex1(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main (String[]args)
	{
		ParameterizedCons_Ex1 obj1 = new ParameterizedCons_Ex1(2,"ABC");
	}
}
