package samiksha;

public class EvenNo {
	
	void printEvenNo(int startIndex, int endIndex) {
		for(int index =startIndex; index<=endIndex; index++) {
			if(index % 2 ==0) {
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNo evenNo = new EvenNo();
		evenNo.printEvenNo(10,15);
	}
}
