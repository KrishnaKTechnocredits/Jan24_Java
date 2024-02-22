package dharma;

public class SumOfNegNumEx1 {

	void negativeNumSum(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '-') {
			char ch = str.charAt(i+1);
			sum = sum + Character.getNumericValue(ch)*-1;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new SumOfNegNumEx1().negativeNumSum("te-3ch4noc7red-8its");
		
	}

}
