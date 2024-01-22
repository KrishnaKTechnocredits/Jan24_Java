package shramika_vaidya;

class Numbers2{
 
	void printEvenNumbers(int startRange,int endRange){
		for(int num=startRange; num<=endRange; num=num+2){
			System.out.println(num);
		}
	}
	public static void main(String [] args){
		Numbers2 numbers2 = new Numbers2();
		numbers2.printEvenNumbers(10,15);
	}
}
