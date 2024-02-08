package rupali_umagol;

public class Assignment43 {
	void printSpecialChar(String str) {
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
			boolean b=Character.isDigit(ch);
			boolean c=Character.isUpperCase(ch);
			boolean d=Character.isLowerCase(ch);
			if(b!=true && c!=true && d!=true) {
				System.out.println(str);
				break;
			}
		}
	}
	
	void printNames(String[] names) {
		for(int i=0;i<names.length;i++) {
			printSpecialChar(names[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assignment43=new Assignment43();
		String[] arr={"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		assignment43.printNames(arr);
	}
}