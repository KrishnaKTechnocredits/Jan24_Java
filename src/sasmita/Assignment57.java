package sasmita;

public class Assignment57 {
	
	int sumOfSquaresodddigits(String str) {
		int sum=0;
		for(int index=0;index<str.length(); index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch)){
			if(ch%2!=0) {
				sum= sum+(Character.getNumericValue(ch)*Character.getNumericValue(ch));
				
			
			}
			}
		}
			System.out.println(sum);
		
		return sum;
	
		}

	public static void main(String[] args) {
		Assignment57 assignment57= new Assignment57();
		assignment57.sumOfSquaresodddigits("te3ch4noc7red8its");

	}

}
