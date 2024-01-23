package shravani_rapelli;

public class First3Numbers {
	
	void printF3Numbers(int startIndex, int endIndex){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
		}
		if(count==3) {
			break;
		}
	}
}
	
	public static void main(String[] args) {
		First3Numbers F3Number = new First3Numbers();
		F3Number.printF3Numbers(10, 500);
	}

}
