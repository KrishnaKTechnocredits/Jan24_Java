package shramika_vaidya;

class SumOfNumber{

	void setData(int startRange,int endRange){
		int count=0;
		int sum=0;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%10==0){
			count++;
			sum=sum+num;
			}
		}
		System.out.println("Expected sum is " +sum);
	}
		
	public static void main(String[] args){
		SumOfNumber sumOfNumber = new SumOfNumber();
		sumOfNumber.setData(10,50);
	}
}