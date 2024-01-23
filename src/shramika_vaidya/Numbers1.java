package shramika_vaidya;

class Numbers1{
	
	void printNumbers(int startIndex,int endIndex){
		for(int num = startIndex; num<=endIndex ;num++){
			if(num%5==0 && num%3==0){
				System.out.println("Divisible by 5 & 3, numbers are "+num);
			}
		}
	}
	
	public static void main(String[] args){
		Numbers1 numbers1 = new Numbers1();
		numbers1.printNumbers(5,40);
	}
}
				
	