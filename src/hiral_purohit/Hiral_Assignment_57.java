package hiral_purohit;
//"Print sum of squares of odd digits:

//input: te3ch4noc7red8its
//output: 58 

public class Hiral_Assignment_57 {

	void toPrintSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					sum += (num * num);
				}
			}
		}
		System.out.println("sum of squares of odd digits: " + sum);
	}

	public static void main(String[] args) {
		new Hiral_Assignment_57().toPrintSum("te3ch4noc7red8its");
	}

}
