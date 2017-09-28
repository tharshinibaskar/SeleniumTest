package variables;
/* CREATED ON 10TH SEP*/
public class LocalVariables { // userdefined method
	
	/*LOCAL VARIABLES*/
	public void LocalVariable(){
		int a = 100;  // Variable with in method
		int b = 100;
		int c= a+b;
		System.out.println(c);
	}
	public static void main(String[] args) { // predefined methods
	     
		LocalVariables obj1 = new LocalVariables();
		obj1.LocalVariable();	
	}
}