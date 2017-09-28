package methods;
class X{};
class Emp{};
class Y{};
class Student{};

	public class Example3 {
		
		void M1(X x, Emp e )
		{
			System.out.println("intsane Metod");
			
		}
		
		static void M2(Y y, Student s)
		{
			System.out.println("StatiC Metod Metod");
		}
		public static void main(String[] args)
		{
			Example3 t1 = new Example3();
			X x = new X();
			Emp e = new Emp();
			t1.M1(x,e); //t.M1(new X(), new Emp());
			Y y = new Y();
			Student s = new Student();
			Example3.M2(y, s);// Example3.M2(new Y(), new Student());
			
			
		}
}
