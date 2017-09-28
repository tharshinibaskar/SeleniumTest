package methods;

public class ObjectParameter {
	int length;
	int width;
	
	ObjectParameter(int l, int b)
	{
		length = l;
		width = b;
	}
		void area(ObjectParameter r1)
		{
			//ObjectParameter r1 = new ObjectParameter(length, width);
			int areaOfRect = r1.length*r1.width;
			System.out.println("Area of Rectangel is:  " +areaOfRect);
		}
		public static void main(String[]args)
		{
			ObjectParameter r1 = new ObjectParameter(10, 20);
			r1.area(r1);
		}
}
