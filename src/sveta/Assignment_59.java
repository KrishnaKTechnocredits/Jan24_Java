/*Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4" */
package sveta;

public class Assignment_59 {

	public int maxFrequentch(String str,char c) {
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch ==c) 
				count++;
		}
		return count;
	}
	public void getMaxFrequency(String str) {
		int count=0,no=0;
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			count=maxFrequentch(str, str.charAt(i));
			if(count>no) {
				no=count;
				ch=str.charAt(i);
			}
		}
		System.out.println(ch +"->"+no);
	}
	public static void main(String[] args) {
		String str="TeeCccChH";
		new Assignment_59().getMaxFrequency(str);
	}
}
