package akshada_marne;

public class DivisibleReverse {

	void dividde(int start, int end) {
		for(int num=end;num>=start;num--) {
			if(num%13==0) {
				System.out.println(num+ " is divisible by 13" );
			}
			else if (num%7==0) {
				System.out.println(num+ " is divisible by 7" );
			}
		}
	}
	
	public static void main(String arg[]) {
		DivisibleReverse divisibleReverse = new DivisibleReverse();
		divisibleReverse.dividde(5,40);
	}
}
