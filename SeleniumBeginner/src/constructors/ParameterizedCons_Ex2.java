package constructors;
// Parameter constructor Overload
public class ParameterizedCons_Ex2 {

	static float c;
	ParameterizedCons_Ex2(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	ParameterizedCons_Ex2(int a,String b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	ParameterizedCons_Ex2(int a,float b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main (String[]args)
	{
		ParameterizedCons_Ex2 obj1 = new ParameterizedCons_Ex2(2,c,2);
	}
}
