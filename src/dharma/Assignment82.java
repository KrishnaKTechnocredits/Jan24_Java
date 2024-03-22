package dharma;

public class Assignment82 {

	void digitsCount(String str) {
		int sum = 0;
		String str1[] = str.split(" ");
		for(String name : str1) {
			try {
			int num = Integer.parseInt(name);
			sum = sum + num;
			}catch(Exception e) {
				e.getMessage();
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment82 ass82 = new Assignment82();
		String str = "I am having 11 years and 3 months of experience in java selenium";
		ass82.digitsCount(str);
	}
}
