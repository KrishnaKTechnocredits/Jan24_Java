package technocredits.interview;

import java.util.Arrays;

public class DotSplit {
	
	public static void main(String[] args) {
		String str = "Hello.Hi.Technocredits";
//		char[] chArr = str.toCharArray();
//		int count = 0;
//		for(char ch : chArr) {
//			if(ch == '.')
//				count++;
//		}
//		System.out.println("words : " + (count+1));
	
		String[] arr = str.split("\\.");
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length);
		
		String str1 = "Maulik \" Kanani";
		System.out.println(str1);
	}
}

// Maulik" Kanani