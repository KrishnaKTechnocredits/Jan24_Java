package rohit_sutar;

public class Assignment13 {
	
	void printLastDivisibleNo(int startIndex, int endIndex) {
		System.out.println("Below mentioned number is last number divisible by 5 and 9");
		for(int i = startIndex ; i >= endIndex ; i--) {
			if(i%5==0 && i%9==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.printLastDivisibleNo(100, 5);
	}
}
