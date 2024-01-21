package sasmita;

public class SumOfNumber {
	
	void printSumofNumber(){
		int sum =0;
		for (int index=10; index<=50;index++) {
			if(index%5 == 0 && index%10 == 0) {
				sum=sum+index;
			}
		}
		System.out.println("Expected sum is  " + sum);
	}
	
	public static void main(String[]args){
		SumOfNumber sumnumber = new SumOfNumber();
		sumnumber.printSumofNumber();
	}
}
