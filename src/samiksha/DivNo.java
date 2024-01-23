package samiksha;

public class DivNo {
	
	void printAllDivNo(int startRange, int endRange) {
		for(int index = endRange; index >= startRange; index-- ){
			if(index %7==0) {
				System.out.println(index + " is divisible by 7");
			}else if(index % 13 ==0) {
				System.out.println(index + " is divisible by 13");
			}
        }
	}
	
	public static void main(String[] args) {
		DivNo divNo = new DivNo();
		divNo.printAllDivNo(5,40);
	}
}
	
	