package rupali_umagol;

public class Assignment24 {
	void printUnique(String input) {
		for(int i=0; i <input.length() ;i++) {
			char ch=input.charAt(i);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24=new Assignment24();
		assignment24.printUnique("technocredits");
	}
}
