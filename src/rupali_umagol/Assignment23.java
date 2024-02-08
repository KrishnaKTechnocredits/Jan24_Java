package rupali_umagol;

public class Assignment23 {
	
	int frequency(String name, char value) {
		int count=0;
		String output=name.toLowerCase();
		for(int index=0; index<output.length(); index++) {
		if(output.charAt(index) == value)
			count++;
		}
		return count;
	}
	void uniqueValue() {
		String input="technocredits";
		for (int i=0; i<input.length();i++) {
		char ch=input.charAt(i);
		int result = frequency(input,ch);
		if(result == 1)
		System.out.print(ch);	
		}
	}
	public static void main(String[] args) {
		Assignment23 assignment23=new Assignment23();
		assignment23.uniqueValue();	
	}
}
