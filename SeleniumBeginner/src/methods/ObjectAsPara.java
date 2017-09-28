package methods;

public class ObjectAsPara<object> {

	int x;
	int y;

	public ObjectAsPara(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean objectCheck(ObjectAsPara objectaspara)//type of the parameter name is class nem, & variable name
	{
		
		if(objectaspara.x == x && objectaspara.y == y);
			return true;
	}
		public static void main(String[]args)
		{
			ObjectAsPara t1 = new ObjectAsPara(12, 15);
			ObjectAsPara t2 = new ObjectAsPara(12, 15);
			ObjectAsPara t3 = new ObjectAsPara(15, 20);
			System.out.println("t1 ==t2  " + t1.objectCheck(t2));
			System.out.println("t1 ==t3  " + t1.objectCheck(t3));
			System.out.println("t2 ==t3  " + t2.objectCheck(t3));
		}
}
