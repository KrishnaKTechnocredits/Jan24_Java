package rupali_umagol;

public class ProgrammingTest2 {
	
	void printEvevnDigit(String input) {
		int value=0;
		for (int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				int num=Character.getNumericValue(ch);
				if(num%2==0) {
					value=0;
					value=num;
				}
			}
		}
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		ProgrammingTest2 programtest=new ProgrammingTest2();
		programtest.printEvevnDigit("t2e3ch4n5oc7re8di9ts");
	}
}
