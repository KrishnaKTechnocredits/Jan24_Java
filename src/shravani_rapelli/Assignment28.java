package shravani_rapelli;

public class Assignment28 {
	
	void sumOfAllOddDigits(String str) {
		int sum=0;
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if(flag) {
				int charNum= Character.getNumericValue(ch);
				if(charNum % 2 != 0) {
					sum = sum + charNum;
				}
			}
		}
		System.out.println("output:"+ sum);
	}
	
	public static void main(String[] args) {
		Assignment28 assign28 = new Assignment28();
		assign28.sumOfAllOddDigits("te3ch4noc7red8its");
		assign28.sumOfAllOddDigits("te2chn6ocred8its");
	}

}
