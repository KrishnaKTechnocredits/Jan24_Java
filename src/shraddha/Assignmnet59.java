package shraddha;

class Assignmnet59{
	int getFrequencyChar(String str, char ch){
		int count=0;
		str=str.toLowerCase();
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}
	
	void printCharWithMaxFreq(String str){
		int maxCount=0;
		char targetChar=' ';
		for(int i=0;i<str.length();i++){
			int count = getFrequencyChar(str,str.charAt(i));
			if(maxCount<count)
			maxCount=count;
			targetChar=str.charAt(i);
		}
		System.out.println(targetChar+"->"+maxCount);
	}
	
	public static void main(String[] args){
	new Assignmnet59().printCharWithMaxFreq("TeeCccChH");
	}
}