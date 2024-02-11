package technocredits;

public class StringTricky {

	String str1; 
	String str2 = "null";
	String str3 = null;
	String str4 = "";
	String str5 = "techno";
	
	void m1(){
		System.out.println(str1.length()); // NE
		System.out.println(str2.isEmpty()); // false		
		//System.out.println(str3.isEmpty()); // NE
		System.out.println(str4.isEmpty()); // true
		System.out.println(str3+str5);
		
		if(!str4.isEmpty()) {
			System.out.println("all good");
		}
		
		if(str1 != null) {
			System.out.println(str1.length());
		}
		
	}
	
	public static void main(String[] args){
		new StringTricky().m1();
	}
	
}
