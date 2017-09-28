package methods;

public class AccessObj {
	
	private static Object object;

	public void accesob()
	{
		StoreObject obj1 = new StoreObject();
		
		Object object2 = obj1.Obj();
		
		System.out.println(object);
		//return object2;
	
	}
	
	public static void main(String[]args)
	{
		AccessObj obj1 = new AccessObj();	
	}
	}


 