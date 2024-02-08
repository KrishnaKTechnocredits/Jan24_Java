package rupali_umagol;

public class ProgramTest1 {
	void sumDigit(String input) {
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag == true) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		ProgramTest1 program=new ProgramTest1();
		program.sumDigit("te3ch4nocred8its");
		program.sumDigit("technocredits");
	}
}
