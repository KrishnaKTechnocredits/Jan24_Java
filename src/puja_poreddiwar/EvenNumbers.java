package puja_poreddiwar;

public class EvenNumbers {
	
        int num;
        
	void findEvenNum(int startRange, int endRange) 
	{
		System.out.println("Even numbers are: ");
		for(int num = startRange;num <= endRange; num++) {
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.findEvenNum(10,15);
	}

}
