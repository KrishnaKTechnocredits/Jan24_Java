package rohini_deshmane.collection_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FrequencyOfNumberWithMaxFrequency {

	void printNumberFrequency(int[] numberArr) {
		HashMap<Integer, Integer> numberFreqeuncyMap = new HashMap<>();
		int count=0;
		int maxFrequencyKey = 0;
		int number = 1;
		Set<Integer> keySet = numberFreqeuncyMap.keySet();
		
		for(int num : numberArr) {
			if(numberFreqeuncyMap.containsKey(num)) {
				count = numberFreqeuncyMap.get(num);
				numberFreqeuncyMap.put(num, ++count);
			} else
				numberFreqeuncyMap.put(num, 1);	
		}
		System.out.println("Map : ");
		System.out.println(numberFreqeuncyMap);
		
		int maxFrequencyValue=0;

		for(int key:keySet) {
			number = numberFreqeuncyMap.get(key);
			if(maxFrequencyKey < number) {
				maxFrequencyValue = key;
				maxFrequencyKey = numberFreqeuncyMap.get(key);
			}
		}
		
		System.out.println("\n Max Frequency number = "+maxFrequencyValue);
	}
	
	public static void main(String[] args) {
		int[] numberArr = {10,20,30,10,20,20,55,55,13,13,13,13,13,10};
		FrequencyOfNumberWithMaxFrequency freqencyNumber = new FrequencyOfNumberWithMaxFrequency();
		freqencyNumber.printNumberFrequency(numberArr);
	}
}
