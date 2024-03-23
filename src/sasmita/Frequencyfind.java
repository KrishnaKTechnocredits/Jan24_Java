/*Print frequency of each number from given input. [using Map]
 */

package sasmita;
import java.util.Map;
import java.util.TreeMap;

public class Frequencyfind {

	void freqNumber(int[] arr) {
		Map<Integer, Integer> numberCountMap = new TreeMap<Integer, Integer>();

		for (int num : arr) {
			if (numberCountMap.containsKey(num)) {
				int count = numberCountMap.get(num);
				numberCountMap.put(num, count + 1);
			} else {
				numberCountMap.put(num, 1);
			}
		}
		System.out.println(numberCountMap);

	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Frequencyfind().freqNumber(data);
	}
}
