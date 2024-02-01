package rupali_umagol;

public class Assignment28 {
	void printSum(String input) {
		int sum=0;
		for(int i=0; i<input.length() ;i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				if(ch%2 !=0) {
					int temp=Character.getNumericValue(ch);
					sum = sum+temp;
				}
			}
		}
		System.out.println("Sum of odd digits :" + sum);
	}


	public static void main(String[] args) {
		Assignment28 assignment28=new Assignment28();
		assignment28.printSum("te3ch4noc7red8its");
		
	}
}
