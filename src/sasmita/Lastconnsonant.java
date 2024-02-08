package sasmita;

public class Lastconnsonant {
	
	void consonantLast() {
		String str = "aakansha";
		str.toLowerCase();
		char lastconsonentChar= '*';
		for(int index=0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(ch != 'a' || ch != 'e'|| ch != 'i'|| ch != 'o'|| ch !='u') {
			 if(str.indexOf(ch)== str.lastIndexOf(ch)) {
				 lastconsonentChar =str.charAt(index);
			 }
		}
		
	}
		System.out.println("Last consonant of the "+str + " is "+ lastconsonentChar);
	
}
	public static void main(String[] args) {
		 new Lastconnsonant().consonantLast();
	}
		
	}
