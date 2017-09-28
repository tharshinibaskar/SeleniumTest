package methods;

public class ObjReturnType extends ObjectParameter {
	
	int length;
	int breadth;

	
	ObjReturnType(int l, int b)
	{
		/*length = l;
		breadth = b;*/
		super(b, l);
		this.length = l;
		this.breadth = b;
	}
	
	// object as return type
	ObjReturnType getRectangel()
	{
		ObjReturnType getRec = new ObjReturnType(10,20);
		return getRec;
		
	}
//object as parameter	
	 void objPara(ObjReturnType obj1)
	{
		System.out.println(obj1.length);
		System.out.println(obj1.breadth);

	}

	public static void main(String[] args)
	{
		ObjReturnType obj1 = new ObjReturnType(10, 20);
		obj1.getRectangel();
		System.out.println("ob1.length:  "+obj1.length);
		System.out.println("ob1.breadth:  "+obj1.breadth);
		ObjectParameter obj2 = new ObjectParameter(10,20);
		obj2.area(obj2);	
	}
}
