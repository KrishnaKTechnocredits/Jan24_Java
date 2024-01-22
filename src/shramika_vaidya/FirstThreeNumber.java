package shramika_vaidya;

class FirstThreeNumber{
	
	void printLastNumber(int startIndex,int endIndex) {
		int count=0;
		for(int num=startIndex;num<=endIndex;num++){
			if(num%3==0 && num%4==0){
				System.out.println("First three no divisible by 3 and 4 is "+ num);
				count++;
			}
			if(count==3)
			break;
		}
	}		
	
	public static void main (String[] args){
		FirstThreeNumber firstThreeNumber = new FirstThreeNumber();
		firstThreeNumber.printLastNumber(10,500);
	}
}