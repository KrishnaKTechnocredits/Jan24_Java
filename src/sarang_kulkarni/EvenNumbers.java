package sarang_kulkarni;

public class EvenNumbers {
	
	public static void main (String[] args){
		EvenNumbers evennumbers = new EvenNumbers();
		evennumbers.FindEven(10, 15);
	}

	void FindEven (int StartRange,int EndRange){
		for(int num = StartRange;num <= EndRange; num++){
			if(num % 2 == 0) {
				System.out.println(+ num);
			}
		}
	}
}
