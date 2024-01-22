package shramika_vaidya;

class Numbers{
	
	void printEvenNumbers(int startRange,int endRange){
		for(int num=startRange; num<=endRange; num=num+2){
			System.out.println(num);
		}
	}
	public static void main(String [] args){
		Numbers numbers = new Numbers();
		numbers.printEvenNumbers(10,15);
	}
}
