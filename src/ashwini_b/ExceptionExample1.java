package ashwini_b;
/*
 Assignment - 82 : 14th March'2024
String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14
NOTE : use Exception concept 
 */
public class ExceptionExample1 {
	
  void printSum(String strArray[]) {
	  int sum = 0 ;
	  for (int i = 0 ; i < strArray.length ; i++) {
		  try {
			  sum = sum + Integer.parseInt(strArray[i]);
		  }
		  catch (NumberFormatException e){
			//  System.out.println(strArray[i]);
		  }
	  }
	  System.out.println(sum);
	  
  }
	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		String arrayOfstr[] = str.split(" ");
		ExceptionExample1 exceptionExample1 = new ExceptionExample1();
		exceptionExample1.printSum(arrayOfstr);
	}
}
