package pallavi_raut;

public class FindLastEvenNumInString {
	int temp = 0, count = 0;

	public static void main(String[] args) {
		FindLastEvenNumInString findLastEvenNumInString = new FindLastEvenNumInString();
		findLastEvenNumInString.printLastEvenNum("te3c3hn5o2cre3di7t2s99test");

		// TODO Auto-generated method stub

	}

	int printLastEvenNum(String str) {		
		int sum=0, temp=0;
		for(int index=str.length()-1; index >= 0; index--){
			char ch= str.charAt(index);
			boolean flag=Character.isDigit(ch);
			if (flag == true){
				temp= Character.getNumericValue(ch);
				if (temp % 2== 0){
					System.out.println("Last even number in given string is " + temp);
					break;
				}
			}
		}
		return sum;
	}
}
