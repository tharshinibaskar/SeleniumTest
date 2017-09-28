package methods;

public class ObjectAsRetType {
	
	int x;
	public ObjectAsRetType(int x)
	{
		this.x=x;
	}
	ObjectAsRetType updateObject()  // return type, object of classObjectAsRetType
	{
		ObjectAsRetType temp = new ObjectAsRetType(x+10);
		
		return temp;
		
	}
	
	public static void main(String[]args)
	{
		ObjectAsRetType t = new ObjectAsRetType(15);
		System.out.println("Before Object update   :" +t.x);
		t= t.updateObject();
		System.out.println("After Object update   :" +t.x);
	}
}
