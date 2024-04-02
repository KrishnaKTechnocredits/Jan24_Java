package nikita_patil;
import java.util.HashMap;
import java.util.Map;

/*Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]*/

public class Assignment86 {
	void toFindFreqOfStringChar(String str) {
		char[] charr = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char ch : charr) {
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);

	}

	void toFindFreqOfString(String[] arr) {
		Map<String, Integer> strMap = new HashMap<String, Integer>();
		for (String str : arr) {
			if (strMap.containsKey(str)) {
				int count = strMap.get(str);
				strMap.put(str, count + 1);
			} else {
				strMap.put(str, 1);
			}
		}
		System.out.println(strMap);

	}

	void toFindFreqOfNum(int[] arr) {
		Map<Integer, Integer> strMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (strMap.containsKey(num)) {
				int count = strMap.get(num);
				strMap.put(num, count + 1);
			} else {
				strMap.put(num, 1);
			}
		}
		System.out.println(strMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "technocredits";
		System.out.println("frequency of each character from given String");
		Assignment86 a = new Assignment86();
		a.toFindFreqOfStringChar(str);
		System.out.println("........................................");
		System.out.println("frequency of each String from given array");
		String[] arr = { "Hi", "Hello", " Hi", "India", "Hi", "Hello" };
		a.toFindFreqOfString(arr);
		System.out.println("frequency of each Element from given array");
		System.out.println("........................................");
		int[] input = { 10, 23, 45, 33, 10, 45, 66, 33, 23, 10 };
		a.toFindFreqOfNum(input);

	}
}

	
