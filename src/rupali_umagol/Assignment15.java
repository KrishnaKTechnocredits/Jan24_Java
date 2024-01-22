package rupali_umagol;

public class Assignment15 {
	
	void divResult(int startIndex, int endIndex) {
		int count=0;
		for(int num=startIndex; num<=endIndex; num++) {
			if(num%3==0 && num%4==0) {
				System.out.println(num);
				count++;
				if(count==3)
					break;
			}	
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15=new Assignment15();
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		assignment15.divResult(10, 500);
	}
}
