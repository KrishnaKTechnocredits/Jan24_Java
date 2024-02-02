package rohini_deshmane;

public class TestPrintLastEvenNumber {
	
	void printLastEvenNumber(String str) {
		char ch;
		int evenNumber=0, chNum=0;
		for(int i=0; i< str.length(); i++) {
			ch = str.charAt(i);
			
			if(Character.isDigit(ch)==true) {
				chNum = Character.getNumericValue(ch);
				if(chNum%2 ==0) {
					evenNumber = chNum;
				}
			}
		}
		System.out.println("Last Even Number = "+evenNumber);
	}
	
	public static void main(String[] args) {
		TestPrintLastEvenNumber testPrintLastEvenNumber = new TestPrintLastEvenNumber();
		testPrintLastEvenNumber.printLastEvenNumber("tec2hno4c8red9i3ts");
	}
}
