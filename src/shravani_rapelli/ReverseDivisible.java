package shravani_rapelli;

public class ReverseDivisible {
	
	void printReverseDivisible(int startIndex, int endIndex){
		for(int num = endIndex; num >= startIndex; num--) {
			if(num % 13 == 0)
				System.out.println(num + " is divisible by 13");
			else if(num % 7 == 0)
				System.out.println(num + " is divisible by 7");
		}
	}
	
	public static void main(String[] args) {
		ReverseDivisible reverseDivisible = new ReverseDivisible();
		reverseDivisible.printReverseDivisible(5, 40);
	}

}
