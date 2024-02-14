package sasmita;

public class Assignment56 {
	
	void uniqueVowels(String str) {
		for (int index=0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				if(ch == 'a'|| ch == 'e' || ch=='i' || ch == 'o'|| ch == 'u') {
					System.out.print(ch);
				}
	
		}
	}
	}
	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();
		assignment56.uniqueVowels("technocredits");

	}

}
