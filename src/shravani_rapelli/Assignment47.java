package shravani_rapelli;

public class Assignment47 {
	
	void getStringExtractingDigits(String input) {
		String str = "";
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(!Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Assignment47 assign47 = new Assignment47();
		assign47.getStringExtractingDigits("Aas-H3v7i");
	}

}
