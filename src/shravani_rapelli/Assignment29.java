package shravani_rapelli;

public class Assignment29 {
	
	void sumOfOddEvenDigits(String str){
		int evenNum=0;
		int oddNum=0;
		int diff=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if(flag) {
				int charNum = Character.getNumericValue(ch);
				if(charNum%2 == 0)
					evenNum=evenNum + charNum;
				else
					oddNum=oddNum + charNum;
			}
		}
		if(evenNum > oddNum)
			diff = evenNum - oddNum;
		else
			diff = oddNum - evenNum;
		System.out.println("output: " + diff);
	}
	
	public static void main(String[] args) {
		Assignment29 assign29 = new Assignment29();
		assign29.sumOfOddEvenDigits("te3ch4noc7re9d8its");
	}

}
