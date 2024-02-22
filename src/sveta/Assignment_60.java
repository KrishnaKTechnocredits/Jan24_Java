/*Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"*/
package sveta;

public class Assignment_60 {

	int getChFrequency(String str,char ch) {
		int count=0;
		String str1= str.toLowerCase();
		for(int i=0;i<str1.length();i++) {
			char ch1 =str1.charAt(i);
			if(ch1 ==ch) {
				count++;
			}
		}
		return count;
	}
	char maxCharFreq(String str) {
		int count=0;
		int no=0;
		char ch1=' ';
		String str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch==str1.charAt(i)) {
				count =getChFrequency(str, str.charAt(i));
			}
			if(count>no) {
				no=count;
				ch1=ch;
			}
		}

		return ch1;
	}
	
	void secondMaxFreq(String str) {
		char ch =maxCharFreq(str);
		str=str.replace(Character.toString(ch),"");
		ch=maxCharFreq(str);
		System.out.println("Second Max Frequent Char " +ch + " -> "+ getChFrequency(str, ch));
	}
	
	public static void main(String[] args) {
		new Assignment_60().secondMaxFreq("aakanksha");

	}

}
