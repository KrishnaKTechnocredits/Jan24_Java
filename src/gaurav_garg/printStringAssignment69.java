/*
 String str ="Hell2lo Hi Technnocredits Pune"
  Output -:
       Hell2lo
            Hi
Technnocredits 
          Pune 
 */
package gaurav_garg;

public class printStringAssignment69 {

	int stringleangth(int str[]) {
		int max = 0;
		for (int index = 0; index < str.length; index++) {
			if (max < str[index])
				max = str[index];
		}
		return max;
	}

	String processedata(String str, int maxleangth) {
		String newstr = "";
		for (int i = 1; i <= maxleangth; i++) {
			newstr = newstr + " ";
		}
		newstr = newstr + str;
		return newstr;
	}

	void printProcessingString(String str[]) {
		int wordleangth[] = new int[str.length];
		String newword[] = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			wordleangth[i] = str[i].length();
		}
		int maxlenth = stringleangth(wordleangth);
		for (int i = 0; i < str.length; i++) {
			newword[i] = processedata(str[i], maxlenth - str[i].length());
			System.out.println(newword[i]);
		}
	}

	public static void main(String[] args) {
		String str = "Hell2lo Hi Technnocredits Pune";
		String[] str1 = str.split(" ");
		new printStringAssignment69().printProcessingString(str1);
	}
}
