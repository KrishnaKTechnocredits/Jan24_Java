package shraddha;

/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.*/

class ProgrammingTest1{
	void printSum(String str){
		int sum = 0;
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if (Character.isDigit(ch)){
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		System.out.println("Sum: " +sum);
	}
	
	public static void main(String[] args){
		ProgrammingTest1 programmingTest1 = new ProgrammingTest1();
		programmingTest1.printSum("te3ch4nocred8its");
		programmingTest1.printSum("technocredits");
	}
}