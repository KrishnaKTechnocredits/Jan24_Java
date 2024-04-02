package nikita_patil;

public class Assignment82 {
	void getSumOfDigits(String input) {
		int count = 0;
		String arr[] = input.split(" ");
		for(String str : arr) {
			try{
				count += Integer.parseInt(str);
			} catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println("Sum of all numbers in given string is " + count);;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment82().getSumOfDigits("I am having 11 years and 3 months of experience in java selenium");
	}
}

	
