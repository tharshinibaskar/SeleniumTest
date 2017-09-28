/**
 * 
 */
package dataType;

/* CREATED ON 10TH SEP*/
public class JavaDataType {
	
		String a;
		int b;
		byte c;
		short d;
		long  e;
		float f;
		double g;
		char h;
		boolean i;
		/* STRING DATA TYPE*/
		
		public void StringDataType(){
			
			System.out.println(a);
		}
		
		/* INT DATA TYPE*/
		
		public void IntDataType(){
			
			System.out.println(b);
		}
		
		/* STRIBYTENG DATA TYPE*/
		
		
		public void ByteDataType(){
		
			
			System.out.println(c);
		}
	
		/* SORT DATA TYPE*/
		
		public void SortDataType(){
		
		System.out.println(d);
		
		
	}
	
		/* LONG DATA TYPE*/
		
		public void LongDataType(){
		
		System.out.println(e);
	}
	
		public void FloatDataType(){
			
			System.out.println(f);
		}
		
	/* DOUBLE DATA TYPE*/
		
		public void DoubleDataType(){
		
		System.out.println(g);
	}
		
	/* CHAR DATA TYPE*/
		
		public void CharDataType(){
		
		System.out.println(h);
	}
		
	/* BOOLEAN DATA TYPE*/
		
		public void BooleanDataType(){
		
		System.out.println(i);
	}
		
		
	
	public static void main(String[]agrs){
		JavaDataType obj1 = new JavaDataType();
		
		obj1.StringDataType();		
		obj1.IntDataType();
		obj1.BooleanDataType();
		obj1.ByteDataType();
		obj1.CharDataType();
		obj1.DoubleDataType();
		obj1.FloatDataType();
		obj1.LongDataType();
		obj1.SortDataType();
	}
}