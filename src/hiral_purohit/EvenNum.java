package hiral_purohit;

public class EvenNum {
	
	void m1(int startRange, int endRange) {
		for (int index =startRange ; index <=endRange ; index++) {
			if( index%2  == 0 )
				System.out.println(index);
		}
	}
	
	public static void main (String[] args) {
		EvenNum evenNum = new EvenNum();
		evenNum.m1(10, 15);
	}
}