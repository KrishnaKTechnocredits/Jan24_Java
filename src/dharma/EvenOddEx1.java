package dharma;

public class EvenOddEx1 {

	public static void sumEvenOdd(String str) {
		int sum = 0, sum1 = 0;
		char ch ;
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
			    int input=Character.getNumericValue(ch);
			    if(input%2!=0) {
				    sum+=input;
			    }else if(input%2==0)
				    sum1+=input;
			}	
		}
		System.out.println((sum-sum1));
	}
	
	public static void main(String[] args) {
		sumEvenOdd ("te3ch4noc7re9d8its");
	}
}
