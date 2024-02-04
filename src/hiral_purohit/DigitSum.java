package hiral_purohit;

public class DigitSum {
	int diff = 0;
	int sum1 =0;
	int sum2 =0;

	void getNumValue(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int i = Character.getNumericValue(ch);
					if (i%2 != 0) {
						sum1 = sum1 + i;
					}
					if (i%2 == 0) {
						sum2 = sum2 + i;
					}	
			}
		}
		diff = sum1 - sum2;
		System.out.println("Differance of odd and even number= "+diff);
	}

	public static void main(String[] args) {
		new DigitSum().getNumValue("te3ch4noc7re9d8its");
		
	}



}
