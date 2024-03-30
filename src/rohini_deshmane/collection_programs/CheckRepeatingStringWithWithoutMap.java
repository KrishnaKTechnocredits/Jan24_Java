package rohini_deshmane.collection_programs;

import java.util.HashMap;
import java.util.Set;

/*
 * Assignment - 92 : 25th March'2024 [15 mins] 5mints
program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.

program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.

 */
public class CheckRepeatingStringWithWithoutMap {

	void getStringCountWithMap(String[] strArr) {
		HashMap<String, Integer> stringMap = new HashMap<>();
		int count=0;
		for(String str : strArr) {
			if(stringMap.containsKey(str)) {
				count = stringMap.get(str);
				stringMap.put(str, ++count);
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
		
		System.out.println("MaxCount String = "+maxCountStr +" --> "+maxCount);
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
		for(int i=0; i<index; i++) {
			if(strArr[i].equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	void getStringCountWithoutMap(String[] strArr) {
		int count=0, maxCount=0;
		boolean flag;
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
		String[] strArr= {"abc", "xyz", "abc", "pqr"};
		CheckRepeatingStringWithWithoutMap repeatingStr = new CheckRepeatingStringWithWithoutMap();
		repeatingStr.getStringCountWithMap(strArr);
		repeatingStr.getStringCountWithoutMap(strArr);
	}
}
