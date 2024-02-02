package garima_s;

public class FindLastEvenNumber {
	int getLastEvenNumber(String value) {
		int temp = 0;
		for (int index = (value.length()-1); index >= 0; index--) {
			char ch = value.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				temp = Character.getNumericValue(ch);
				if (temp % 2 == 0) {
					System.out.println(temp);
					break;
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		new FindLastEvenNumber().getLastEvenNumber("tec32h89nocr58dits11");
	}
}