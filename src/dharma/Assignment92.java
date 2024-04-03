package dharma;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {

	void getStringCountWithMap(String[] strArr) {
		
		Map<String, Integer> stringMap = new HashMap<>();
		int count=0;
		for(String str : strArr) {
			if(stringMap.containsKey(str)) {
				count = stringMap.get(str);
				stringMap.put(str, count + 1);
			} else {
				stringMap.put(str, 1);
			}
		}
		System.out.println(stringMap);

		Set<String> keyset = stringMap.keySet();
		int maxCount=0;
		String maxCountStr="";
		for(String key : keyset) {
			if(stringMap.get(key) > maxCount) {
				maxCount = stringMap.get(key);
				maxCountStr = key;
			}
		}

		System.out.println("MaxCount String = " + maxCountStr + " --> " + maxCount);
	}
	int getStrCount(String str, String[] strArr) {
		int count=0;
		for(String strString : strArr) {
			if(str.equals(strString)) {
				count++;
			}
		}
		return count;
	}

	boolean isProcessed(String str, String[] strArr, int index) {
		for(int i = 0; i < index; i++) {
			if(strArr[i].equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	void getStringCountWithoutMap(String[] strArr) {
		int count=0, maxCount=0;
		String maxStr="";
		System.out.println();
		for(int i=0; i<strArr.length; i++) {
			if(!isProcessed(strArr[i], strArr, i)) {
				count = getStrCount(strArr[i], strArr);
				System.out.println(strArr[i] +" --> "+count);
				if(count > maxCount) {
					maxCount = count;
					maxStr = strArr[i];
				}
			}
		}
		System.out.println("Max count String without map = "+maxStr +" --> "+maxCount);
	}
	
	public static void main(String[] args) {
		Assignment92 ass92 = new Assignment92();
		String[] str = {"abc", "xyz", "abc", "pqr"};
		ass92.getStringCountWithMap(str);
		ass92.getStringCountWithoutMap(str);
	}
}
