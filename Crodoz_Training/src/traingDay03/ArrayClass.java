package traingDay03;

public class ArrayClass {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int []b = {10,20,30,40,50};
		int [] c = {10,20,30,40,50};
		int[] d = {10,20,30,40,50};
  int x[] = new int[5];
  x[0] = 100;
  x[1] = 200;
  System.out.println(a[2]);
  for(int i = 0;i<5; i++){
	  System.out.println(a[i]);
	  if(a[i]==30){
		  System.out.println("Value is 30");
		  break;
	  }else{
		  System.out.println("Value is not 30");
		  continue;
	  }
  }
	}

}

//10 array of val and validate which are all even number
// 100 array of value and validate smallest and largest numbe from it
//Get 100 array of value and make it an assending and decending value, keep 2 method and have assigned from global var
//which is prime and which is not prime.

