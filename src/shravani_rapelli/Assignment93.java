package shravani_rapelli;

public class Assignment93 {

	
	void swapOfTwoNumbersWithoutThirdVariable(int num1 ,int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
	}
	
	void swapingOfTwoStringWihoutThirdVariable(String str1, String str2) {
		str1 = str1 + str2;//TechnoCredits
		str2 = str1.substring(0, str1.length()-7);
		str1 = str1.substring(str2.length(),str1.length());
		System.out.println("Str1 = " + str1);
		System.out.println("Str2 = " + str2);
	}
	
	public static void main(String[] args) {
		Assignment93 assgn93 = new Assignment93();
		assgn93.swapOfTwoNumbersWithoutThirdVariable(10, 30);
		assgn93.swapingOfTwoStringWihoutThirdVariable("Techno", "Credits");
	}
}
