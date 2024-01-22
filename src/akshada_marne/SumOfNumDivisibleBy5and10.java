package akshada_marne;

public class SumOfNumDivisibleBy5and10 {
	int sum=0;
	void sum(int start, int end) {
		for(int num=start;num<=end;num++) {
			if(num%5==0 && num%10==0) {
				sum=sum+num;
			}
		}
		
	}
	
	void print() {
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		SumOfNumDivisibleBy5and10 sumOfNumDivisibleBy5and10 = new SumOfNumDivisibleBy5and10();
		sumOfNumDivisibleBy5and10.sum(10,50);
		sumOfNumDivisibleBy5and10.print();
		
	}
}
