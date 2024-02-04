package shridhar_k;

public class ProgrammingTest2 {
	int getLastEevenDigit(String inputStr) {
		int lastEvenNum = -1;
		for (int i = 0; inputStr.length() > i ; i++) {
			char ch = inputStr.charAt(i);
			int num = Character.getNumericValue(ch);
			boolean flag = Character.isDigit(ch);
			if(flag) {
				if (num % 2 == 0) {
					lastEvenNum = num;
				}
			}
		}
		if (lastEvenNum == -1) {
			System.out.println("No even number in given string");
			return lastEvenNum;
		}
		else
			return lastEvenNum;
	}

	public static void main(String[] args) {
		System.out.println(new ProgrammingTest2().getLastEevenDigit("Tes2cno8Cr7dts"));
		
	}

}
