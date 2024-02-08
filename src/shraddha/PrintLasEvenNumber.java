/*Programming test - 2 : 02 Feb'2024
Print last even number from a String*/

package shraddha;

class PrintLasEvenNumber{
	void evenNumber(String str){
			int even=0;
		for (int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int temp = Character.getNumericValue(ch);
				if(temp%2==0)
					even = temp;
			}
		}
		System.out.println("Last even number from given string is:"+even);
	}
	public static void main(String[] args){
		PrintLasEvenNumber print = new PrintLasEvenNumber();
		print.evenNumber("te3ch4no6cre8di5t2s");
	}
}