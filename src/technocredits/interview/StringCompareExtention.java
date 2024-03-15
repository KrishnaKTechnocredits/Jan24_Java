package technocredits.interview;

public class StringCompareExtention {
	
	public static void main(String[] args) {
		String str1 = "TECHNO";
		String str2 = "techno";
		String str3 = str2.toUpperCase();
		String str4 = str1.substring(0,2) + str2.substring(2).toUpperCase(); // "TECHNO"
		String str5 = str4;
		
		String str6 = str4.intern();
		
		if(str1 == str2) 
			System.out.println(1);
		
		if(str1 == str3)
			System.out.println(2);
		
		if(str1 == str4)
			System.out.println(3);
		
		if(str4 == str5)
			System.out.println(4);
		
		if(str1 == str6)
			System.out.println(5);
		
		System.out.println("end");
	}
}
