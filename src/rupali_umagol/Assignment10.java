package rupali_umagol;

public class Assignment10 {

	void evenNumber(int startRange, int endRange) {
		
		for (int num=startRange ; num <= endRange ; num++) {
			if (num%2 == 0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Assignment10 assignment10=new Assignment10();
		System.out.println("Even Numbers are : ");
		assignment10.evenNumber(10, 15);
	}
}
