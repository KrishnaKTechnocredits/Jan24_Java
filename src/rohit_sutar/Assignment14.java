package rohit_sutar;

public class Assignment14 {
	void printSum(int startIndex, int endIndex) {
		int sum = 0;
		for(int i = startIndex ; i<=endIndex ; i++){
			if(i%5==0 && i%10==0){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printSum(10, 50);
	}
}
