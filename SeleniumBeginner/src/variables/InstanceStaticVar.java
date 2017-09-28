package variables;

public class InstanceStaticVar 
{	int a = 10;
	static int b = 20;
	public static void main (String[]args)
	{	InstanceStaticVar t  = new InstanceStaticVar();
		System.out.println(t.a); //10
		System.out.println(t.b); //20
		t.a = 999;
		t.b = 888;
		System.out.println(t.a); //999
		System.out.println(t.b); //888
		InstanceStaticVar t1  = new InstanceStaticVar();
		System.out.println(t1.a); //10
		System.out.println(t1.b);//888
		t1.b=777;
		InstanceStaticVar t2  = new InstanceStaticVar();
		System.out.println(t2.a); //10
		System.out.println(t2.b);//777	
	}		

}
