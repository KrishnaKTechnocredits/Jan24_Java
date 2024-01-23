package rupali_umagol;

public class Assignment13 {
	void divResult(int startIndex, int endIndex) {
		int count=0;
		for(int num=startIndex ; num< endIndex ; num++) {
			if (num%5==0 && num%9==0) 
				count=num;
		}
		System.out.println("Last number Divisible by 5 a& 9 is " + count);
		
	}
		
	public static void main(String[] args) {
		Assignment13 assignment13=new Assignment13();
		assignment13.divResult(5, 100);
	}

}
