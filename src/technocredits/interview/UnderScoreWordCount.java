package technocredits.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class UnderScoreWordCount {
	
	Map<String,Integer> printWordUnderscoreCount(String input) {
		String wordTemp = "",underScoreTemp="";
		Map<String,Integer> wordUnderScoreMap = new LinkedHashMap<String, Integer>();
		char[] chArr = input.toCharArray();
		for(char ch : chArr) {
			if(ch == '_') {
				underScoreTemp += ch;
			}else {
				if(underScoreTemp.length() > 0) {
					//System.out.println(wordTemp + "->" + underScoreTemp.length());
					wordUnderScoreMap.put(wordTemp, underScoreTemp.length());
					wordTemp = "";
					underScoreTemp = "";
				}
				wordTemp += ch;
			}
		}
		if(wordTemp.length()>0) {
			//System.out.println(wordTemp + "->" + underScoreTemp.length());
			wordUnderScoreMap.put(wordTemp, underScoreTemp.length());
		}
		return wordUnderScoreMap;
	}
	
	public static void main(String[] args) {
		String str = "Maulik___Krishna__Aashvi____.";
		Map<String,Integer> outputMap = new UnderScoreWordCount().printWordUnderscoreCount(str);
		System.out.println(outputMap);
	}
}
