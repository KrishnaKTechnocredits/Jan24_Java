package shramika_vaidya;

class ReverseOrder{
	
	void setData(int startIndex,int endIndex){
		for(int num=endIndex;num>=startIndex;num--){
			if(num%7==0){
				System.out.println(num + " is divisible by "+ 7);
			}
			else if(num%13==0){
				System.out.println(num + " is divisible by "+ 13);
		    }
		}
	}
	
	public static void main(String[] args){
		ReverseOrder reverseOrder = new ReverseOrder();
		reverseOrder.setData(5,40);
	}
}
