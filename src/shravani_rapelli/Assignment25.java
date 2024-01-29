package shravani_rapelli;

public class Assignment25 {
	
	void duplicateCharcter(String input) {
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(index == input.indexOf(ch)){
				if(input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment25 assign25 = new Assignment25();
		assign25.duplicateCharcter("aakanksha");
		
	}

}
