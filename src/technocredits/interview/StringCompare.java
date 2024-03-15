package technocredits.interview;

public class StringCompare {
	
	public static void main(String[] args) {
		String str1 = "techno";
		String str2 = "techno";
		String str3 = new String("techno");
		String str4 = new String("techno");

		if(str1 == str2){
			System.out.println(1);
		}

		if(str1 == str3){
			System.out.println(2);
		}

		if(str1 == str4){
			System.out.println(3);
		}

		if(str3 == str4){
			System.out.println(4);
		}

		if(str1.equals(str2)){
			System.out.println(5);
		}
		if(str1.equals(str3)){
			System.out.println(6);
		}
		if(str1.equals(str4)){
			System.out.println(7);
		}
		if(str3.equals(str4)){
			System.out.println(8);
		}
	}
}
