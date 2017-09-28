package constructors;
// Variables override
public class ParameterizedCons_Ex3 {	
	
	int var = 20;
	ParameterizedCons_Ex3()
	{
		this.var=10; // Assign the value to global variable VAR
	}
	
	ParameterizedCons_Ex3(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main (String[]args)
	{
		ParameterizedCons_Ex3 obj1 = new ParameterizedCons_Ex3(2,"ABCD");
		ParameterizedCons_Ex3 obj2 = new ParameterizedCons_Ex3();
		System.out.println(obj2.var);
	}
}
