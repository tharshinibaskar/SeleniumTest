package variables;
/* CREATED ON 10TH SEP*/
public class InstanceVariables {
	
	/*INSTANCE VARIABLES*/
	int a = 100;  // Variable outside the method
	int b = 100;
	public void InstanceVariable(){
	
		System.out.println(a+b);
	}
	public static void main(String[] args) { // predefined methods
	     
		InstanceVariables obj1 = new InstanceVariables();
		obj1.InstanceVariable();	
	}
}
