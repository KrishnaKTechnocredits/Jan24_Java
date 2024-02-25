//Print sum of negative numbers:
//input: te-3ch4noc7red-8its
//output: -11"


package sasmita;

public class Assignment61 {
	void findSumofNegativeNumbers(String str) {
		int sum=0;
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(str.charAt(index)=='-') {
				char ch1= str.charAt(index+1);
				sum= sum+Character.getNumericValue(ch1)*-1;
				
			}
		}
		System.out.println( sum);
	}

	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		assignment61 .findSumofNegativeNumbers("te-3ch4noc7red-8its");
	}

}
