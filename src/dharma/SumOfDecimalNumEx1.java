package dharma;

public class SumOfDecimalNumEx1 {

	void printSum(String input) {
		double sum = 0;
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				if(input.charAt(i + 1) == '.' && Character.isDigit(input.charAt(i + 2))) {
					String str = ch + "." + (input.charAt(i + 2));
					double new1 = Double.parseDouble(str);
					i = i + 2;
					sum = sum + new1;
				}else {
					int num = Character.getNumericValue(ch);
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new SumOfDecimalNumEx1().printSum("te3ch4.5noc7red8.1its");
		
	}

}
