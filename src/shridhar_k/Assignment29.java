//Print difference between sum of all the odd digits and even digits in the given String.
package shridhar_k;

public class Assignment29 {
	void printDiffBetEvenOdd(String inputStr) {
		System.out.println("input: " + inputStr);
		int evenNum = 0;
		int oddNum = 0;
		int diff =0;
		for (int i = 0; i< inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				int chNum = Character.getNumericValue(ch);
				if (chNum % 2 == 0) 
					evenNum = evenNum + chNum;
				else
					oddNum = oddNum + chNum;
			}
		}
		if(evenNum > oddNum)
			diff = evenNum - oddNum;
		else
			diff = oddNum - evenNum;
		System.out.println("output: " + diff);
	}
	public static void main(String[] arg) {
		new Assignment29().printDiffBetEvenOdd("te3ch4noc7re9d8its");
	}
}
