package shravani_rapelli;

public class Assignment82 {

	void displayCountOfDigits(String str) {
		int sum =0;
		String newstr[] = str.split(" ");
		for(String nm: newstr) {
			try {
				int num = Integer.parseInt(nm);
				sum = sum+num;
			}catch(Exception e) {
				e.getMessage();
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment82 assgn82 = new Assignment82();
		String str = "I am having 11 years and 3 months of experience in java selenium";
		assgn82.displayCountOfDigits(str);
	}
}
