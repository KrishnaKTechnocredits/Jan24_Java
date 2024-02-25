//Assignment - 57 :Print sum of squares of odd digits:input: te3ch4noc7red8its  & output: 58 


package atisha;


public class Assignment57 {
	
void getSumOfOddSquare(String str) {
	int sum=0;
	for(int i=0 ; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isDigit(ch)) {
		int num = Character.getNumericValue(ch);
		if (num %2== 1) {
			sum+=(num*num);
		}
		}
	}
	System.out.println(sum);
	
	
	
}

public static void main(String[] args) {
	new Assignment57().getSumOfOddSquare("te3ch4noc7red8its"); 
}

}
