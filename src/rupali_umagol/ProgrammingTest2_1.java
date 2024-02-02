package rupali_umagol;

public class ProgrammingTest2_1 {
	
	void printLast(String input) {
		char value='t';
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if (ch != 'a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				//System.out.println(ch);
				value=ch;
			}
		}
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		ProgrammingTest2_1 programTest=new ProgrammingTest2_1();
		programTest.printLast("aakankasha");
	}
}
