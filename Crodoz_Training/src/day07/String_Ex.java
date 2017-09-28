package day07;

public class String_Ex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Mathan";
		String s2="MATHAN";
		String s3="Mathan";
		String s4=" Mathan ";
		String s5 = "This is Java Session";
		String s6 = "Ticket is : 1020";
		String sPrice = "$ 900";
		
		System.out.println("Equal Method : "+s1.equals(s2));
		System.out.println("Equal Method : "+s1.equals(s3));
		System.out.println("Equal Ignore Case Method : "+s1.equalsIgnoreCase(s2));
		
		System.out.println("Equal Operator : "+(s1==s2));
		System.out.println("Equal Operator : "+(s1==s3));
		
		System.out.println("Compare Method : "+s1.compareTo(s2));
		System.out.println("Compare Method : "+s1.compareTo(s3));
		System.out.println("Compare Ignore Case Method : "+s1.compareToIgnoreCase(s2));
		
		System.out.println("Concat Method : "+s1.concat(" Chandrasekaran"));
		System.out.println("Concat Operator : "+(s1+" "+s2));
		
		System.out.println("Lower Case : "+s2.toLowerCase());
		System.out.println("Lower Case : "+s2.toUpperCase());
		
		System.out.println("Length Method : "+s1.length());
		
		System.out.println("Trim Method : "+s4.trim());
		
		System.out.println("Sub String Method : "+s1.substring(2));
		System.out.println("Sub String Method : "+s1.substring(2, 4));
		
		System.out.println("Contains Method : "+s1.contains("th"));
		System.out.println("Contains Method : "+s1.contains("e"));
		
		System.out.println("Replace Mehod : "+s1.replace('a', 'e'));
		System.out.println("Replace Mehod : "+s5.replace("Java", "Selenium"));
		System.out.println("Replace with Regx : "+s6.replaceAll("[A-Z a-z]", "").trim());
		System.out.println("Replace with Regx : "+s6.replaceAll("[0-9]", "").trim());
		System.out.println("Replace with Regx : "+s6.replaceAll("[^0-9]", "").trim());
		
		System.out.println("Replace with Regx :"+sPrice.replaceAll("[^0-9]", ""));
		sPrice = sPrice.replaceAll("[^0-9]", "");
		int iPrice = Integer.parseInt(sPrice);
		if(iPrice>0){
			System.out.println("Product has Value");
		}
		
		String sDate = "09/24/2017";
		
		
		String sSplit[] = sDate.split("/");
		System.out.println("Date is : "+sSplit[1]);
		
		for(int i=0;i<sSplit.length;i++){
			System.out.println(sSplit[i]);
		}
		
		String sName[] = s1.split("");
		for(int i=0;i<sName.length;i++){
			System.out.println(sName[i]);
		}
		
	}

}
