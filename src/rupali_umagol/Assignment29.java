package rupali_umagol;

public class Assignment29 {
	int printOdd(String input) {
		int sum1=0;
		for(int i=0; i<input.length() ;i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				if(ch%2 !=0) {
					int temp=Character.getNumericValue(ch);
					sum1 = sum1+temp;
				}
			}
		}
		return sum1;
	}
	int printEven(String input) {
		int sum2=0;
		for(int i=0; i<input.length() ;i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				if(ch%2 ==0) {
					int temp=Character.getNumericValue(ch);
					sum2 = sum2+temp;
				}
			}
		}
		return sum2;
	}
	void sumOddEven(String input) {
		int temp1=printOdd(input);
		int temp2=printEven(input);
		int diff=temp1 - temp2;
		System.out.println("Diff is : "+ diff);
		
		
	}



	public static void main(String[] args) {
		Assignment29 assignment29=new Assignment29();
		assignment29.sumOddEven("te3ch4noc7re9d8its");
		
	}
}

