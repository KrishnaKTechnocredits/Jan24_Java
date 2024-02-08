package dharma;

public class StringEvenNoEx1 {

	public static void evenNo1(String str) {
		char ch;
		int input=0;
		for(int i=0;i<str.length()-1;i++) {
			ch=str.charAt(i);
			if(Character.isDigit(ch)==true)
				if(Character.getNumericValue(ch)%2==0)
					input = Character.getNumericValue(ch);
		}
		System.out.println(input);
	}
	public static void main(String[] args) {
		evenNo1("te3ch4nocred8its");
		

	}

}
