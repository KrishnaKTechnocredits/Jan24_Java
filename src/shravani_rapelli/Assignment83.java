package shravani_rapelli;

public class Assignment83 {
	
	void printWordUnderScoreCount(String str) {
		String wordTemp = "";
		String underScoreTemp="";
		char[] chArr = str.toCharArray();
		for(char ch : chArr) {
			if(ch =='_') {
				underScoreTemp += ch;
			}else {
				if(underScoreTemp.length()>0) {
					System.out.println(wordTemp + "->" + underScoreTemp.length());
					wordTemp = "";
					underScoreTemp = "";
				}
				wordTemp += ch;
			}
		}
		if(wordTemp.length()>0) {
			System.out.println(wordTemp + "->" + underScoreTemp.length());
		}
	}
	
	public static void main(String[] args) {
		Assignment83 assgn83 = new Assignment83();
		String str = ("I__am___in_pune____");
		assgn83.printWordUnderScoreCount(str);
	}

}
