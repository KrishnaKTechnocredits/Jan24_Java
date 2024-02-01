package nisarg_patel;

public class Assignment22ContDigits {

	static int count=0;
	void coundigits() {
		String str="te3c3hn5o2cre3dits";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total nnumber of digits in given string = "+count);
	}

	public static void main(String[] args) {

		new Assignment22ContDigits().coundigits();
	}
}
