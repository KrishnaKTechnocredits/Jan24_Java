/* Print last character with minimum frequency:
input: aakanksha
output: h->1 ---------------*/

package pallavi_raut;

public class FindLastCharWithMinFreq_58 {
	
	public static void main(String args[])
	{
		FindLastCharWithMinFreq_58 findMinFrechar = new FindLastCharWithMinFreq_58();
		String str="aakanksha";
		findMinFrechar.lastChar(str);
	}
	
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
}	