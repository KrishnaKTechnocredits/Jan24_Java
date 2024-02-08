package rupali_umagol;

public class Assignment14 {
	void divResult(int startIndex, int endIndex) {
		int sum=0;
		for (int num=startIndex; num<=endIndex; num++)
			if(num%5==0 && num%10==0) {
				sum=sum+num;
			}
		System.out.println("Expected Sum is : "+ sum);
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14=new Assignment14();
		assignment14.divResult(10, 50);
	}
}
