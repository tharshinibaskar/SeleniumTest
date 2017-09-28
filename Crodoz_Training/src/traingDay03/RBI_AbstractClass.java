package traingDay03;

public class RBI_AbstractClass {

		int iRBI_ID =100;
		String sBrabch = "Parrys";
		
		RBI_AbstractClass(){
			System.out.println("RBI Default constructor");
		}
		
		public double homeLoan()
		{
			return 8.30;
		}
		
		public double carLoan()
		{
			return 10.30;
		}
		public double personalLoan()
		{
			return 18.3;
		}
}
