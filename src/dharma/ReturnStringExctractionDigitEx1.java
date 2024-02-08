package dharma;

public class ReturnStringExctractionDigitEx1 {

	void printDigit(String name) {
		String str =" ";
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ReturnStringExctractionDigitEx1().printDigit("Aas-H3v7i");
	}
}

