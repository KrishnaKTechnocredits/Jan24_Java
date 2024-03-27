package puja_poreddiwar;

	import java.util.LinkedHashMap;
	import java.util.Map;
		
	public class Assignment86_3 {
		
		void getFreqOfEachNumber(int[] arr) {
			
			Map<Integer, Integer> numberCount = new LinkedHashMap<Integer, Integer>();
			
			for(int number : arr) {
				if(numberCount.containsKey(number)) {
					int count = numberCount.get(number);
					numberCount.put(number, count +1);
				}else {
					numberCount.put(number, 1);
				}
			}
			System.out.println(numberCount);
		}
			
		public static void main(String[] args) {
			int[] data = {10,10,3,4,3,3,3,3,55,56};
			new Assignment86_3().getFreqOfEachNumber(data);
		}
	}

