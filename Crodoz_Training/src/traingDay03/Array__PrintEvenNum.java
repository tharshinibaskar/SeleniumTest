package traingDay03;

public class Array__PrintEvenNum {

	//10 array of val and validate which are all even number
	
	public static void main (String[]args){	
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b = a.length;
		System.out.println(b);
		for(int i =0;i<b;i++){
			int c = a[i]%2;
			if (c%i==0)	
			System.out.println("Not prime  number " +a[i]);
			//else
				//System.out.println("odd  number " +a[i]);	
			else
				System.out.println(" prime  number " +a[i]);
		}
		
		
	}
	
}
