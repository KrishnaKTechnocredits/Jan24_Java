package shraddha;

public class Assignment_82 {

	void getSum(String str) {
		int sum=0;
		String[] str1 = str.split(" ");
		for(int i=0; i <str1.length; i++) {
			try {
				sum = sum + Integer.parseInt(str1[i]);
			} catch(NumberFormatException e) {
				
			}
		}
		System.out.println("Sum of Digits in given string = "+sum);
	}
	
	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		Assignment_82 ass82 = new Assignment_82();
		ass82.getSum(str);
	}
}
