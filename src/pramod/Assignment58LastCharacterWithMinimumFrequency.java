package pramod;

//Assignment - 58 : 14th Feb'2024
//"Print last character with minimum frequency:
//input: aakanksha
//output: h->1""


public class Assignment58LastCharacterWithMinimumFrequency {
	
	void lastChar(String str)
	{ 
		int count=0;
		for (int index = (str.length() - 1); index >= 0; index--) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				count++;
				System.out.println(ch+"-->"+count);
				break;
			}
		}
	}
			
	public static void main(String args[])
	{
		Assignment58LastCharacterWithMinimumFrequency assign58 = new Assignment58LastCharacterWithMinimumFrequency();
		String str="aakanksha";
		assign58.lastChar(str);
	}
}
