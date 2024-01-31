package hiral_purohit;

public class SumOfDigit2 {
	int sum = 0;

	void getNumValue(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int i = Character.getNumericValue(ch);
					if (i%2 != 0) {
						sum = sum + i;
					}	
			}
		}
		System.out.println("sum of odd digits from String--> "+sum);
	}

	public static void main(String[] args) {
		new SumOfDigit2().getNumValue("te3ch4noc7red8its");
		new SumOfDigit2().getNumValue("te2chn6ocred8its");
	}


}
