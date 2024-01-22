package shramika_vaidya;

class LastNumber{
	
	void printLastNumber(int startIndex,int endIndex){
		for(int num=endIndex;num>=startIndex;num=num-1){
			if(num%5==0 && num%9==0){
				System.out.println("last no divisible by 5 and 9  is " + num);
			break;
			}
		}
		
	}
		
	public static void main (String[] args){
		LastNumber lastNumber = new LastNumber();
		lastNumber.printLastNumber(5,100);
		}
}