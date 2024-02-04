package samiksha;

public class Sum2 {
	
    void printSum() {
		String str = "te3ch4nocred8its";
		int sum = 0;
		for (int num = 0; num <= str.length() - 1; num++) {
			char ch = str.charAt(num);
			boolean flag = (Character.isDigit(ch));
			if (flag == true) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		System.out.println(sum);
	}

	void printSum1() {
		String str = "technocredits";
		int sum = 0;
		for (int num = 0; num <= str.length() - 1; num++) {
			char ch = str.charAt(num);
			boolean flag = (Character.isDigit(ch));
			if (flag == true) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		System.out.println(" sum of digits in " + str + " is " + sum);
	}

	public static void main(String[] args) {
		Sum2 s = new Sum2();
	    s.printSum();
		s.printSum1();
	}
}



