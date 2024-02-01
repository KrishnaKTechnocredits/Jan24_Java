package hiral_purohit;

public class DuplicateChar {
	
	 void printDuuplicateChar(String str) {
		
		 for(int i =0; i <str.length(); i++) {
			 char ch =str.charAt(i);
			 if(i == str.indexOf(ch)) {
				 if(str.indexOf(ch) != str.lastIndexOf(ch)) {
				 System.out.print(ch);
				}
			 }	 
		 }
	 }
	 
	 public static void main(String[] args) {
		 new DuplicateChar().printDuuplicateChar( "aakanksha");
	 }
}
