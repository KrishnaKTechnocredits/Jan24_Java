package shravani_rapelli;

public class Assignment26 {
	
	void removeVowels(String str) {
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				String temp = String.valueOf(ch);
				str= str.replace(temp, "");
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Assignment26 assign26 = new Assignment26();
		assign26.removeVowels("technocredits");
		
	}

}
