package puja_poreddiwar;

	import java.util.LinkedHashMap;
	import java.util.Map;
		
	public class Assignment86_2 {
		
		void getFreqOfEachWord() {
			String str= "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
			String[] strWords = str.split(" ");
			Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
			
			for(String names : strWords) {
				if(wordCount.containsKey(names)) {
					int count = wordCount.get(names);
					wordCount.put(names, count +1);
				}else {
					wordCount.put(names, 1);
				}
			}
			System.out.println(wordCount);
		}
			
		public static void main(String[] args) {
			new Assignment86_2().getFreqOfEachWord();
		}
	}

