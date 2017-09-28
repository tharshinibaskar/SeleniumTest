package traingDay03;

public class PrimeNumberOrNot {
	public static void main(String[]args){
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b = a.length;
	//System.out.println(b);
	for(int i =0;i<b;i++){
		int c = a[i]/2;
		for (int j =2;j<=c;j++){
			if(a[i]%j==0){
				System.out.println("Number is not prime:  "+a[i]);
			}
		}
//		System.out.println("Number is  prime:  "+a[i]);
	}
	
}
}
