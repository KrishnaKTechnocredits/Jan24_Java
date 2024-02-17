package shraddha;

/*Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:*/

class Assignment60{
	int charFrequency(String str,char ch){
		int count=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)==ch)
			count++;
		}
		return count;
	}
	
		Character maxFrequencyChar(String str){
		int maxCount=0;
		char targerChar=' ';
		for(int i=0;i<str.length();i++){
			int count=charFrequency(str,str.charAt(i));
			if(maxCount<count){
			maxCount=count;
			targerChar=str.charAt(i);
			}
		}
		return targerChar;
	}
	
		public static void main(String[] args){
			Assignment60 ass = new Assignment60();
			String str="aakanksha";
			Character ch = ass.maxFrequencyChar(str);
			String str1 = str.replace(Character.toString(ch),"");
			ch = ass.maxFrequencyChar(str1);
			int i = ass.charFrequency(str1,ch);
			System.out.println("Character with 2nd highest frequency is "+ch+"--> "+i);
		}
		
		}
