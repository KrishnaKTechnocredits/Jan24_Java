package dharma;

public class SumOfSquareOfOddEx1 {

	void sumOfSquareOfOdd(String str) {
		int sum = 0;
		 for(int i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			 if(Character.isDigit(ch)) {
				 if(ch % 2 != 0)
					 sum = sum + (Character.getNumericValue(ch) * Character.getNumericValue(ch));
			 }
		 }
		 System.out.println(sum);
	}
	public static void main(String[] args) {
		SumOfSquareOfOddEx1 sumofsquareofoddex1 = new SumOfSquareOfOddEx1();
		sumofsquareofoddex1.sumOfSquareOfOdd("te3ch4noc7red8its");

	}

}
