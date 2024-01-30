package rupali_umagol;

public class Assignment25 {
	void printDuplicate(String input) {
		for(int i=0; i<input.length();i++) {
			char ch=input.charAt(i);
			if(i==input.indexOf(ch)) {
			if(input.indexOf(ch)!= input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25=new Assignment25();
		assignment25.printDuplicate("aakanksha");
	}
}
