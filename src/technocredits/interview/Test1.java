package technocredits.interview;

public class Test1 {

	public static void main(String[] args) {
		String str2 = "techno";
		
		str2 = str2.substring(0,1).replace(str2.charAt(0), Character.toUpperCase(str2.charAt(0))) + str2.substring(1); 
		str2 =  str2.substring(0,str2.length()-1) + str2.substring(str2.length()-1).replace(str2.charAt(str2.length()-1), Character.toUpperCase(str2.charAt(str2.length()-1)));
		System.out.println(str2);
	}
}
