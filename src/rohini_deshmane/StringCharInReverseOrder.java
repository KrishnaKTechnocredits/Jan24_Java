package rohini_deshmane;

class StringCharInReverseOrder {
	
	void printCharInReverse(String OriginalString) {
		for(int i=OriginalString.length()-1; i>=0; i--) {
			System.out.println(OriginalString.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		StringCharInReverseOrder stringCharInReverseOrder = new StringCharInReverseOrder();
		System.out.println("Original String is = techno");
		stringCharInReverseOrder.printCharInReverse("techno");
		System.out.println("\n\nOriginal String is = Hello Rohini");
		stringCharInReverseOrder.printCharInReverse("Hello Rohini");
	}

}
