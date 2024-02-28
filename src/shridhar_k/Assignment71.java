package shridhar_k;
/*
String str = "H5el2lo Hi Tech3noc2redits Pulne";
output
                   7Hello
                      0Hi
           5Technocredits
                    1Pune
*/

class Assignment71{

	int maxWordLength;
	
	String digitSumRearrange(String inpStr){
		int addition = 0;
		String outStr ="";
		for(int i=0;i<inpStr.length();i++){
			char ch = inpStr.charAt(i);
			if(Character.isDigit(ch)){
				String chStr = String.valueOf(ch);
				addition += Integer.parseInt(chStr);
			}else{
				outStr = outStr + ch;
			}
		}
		return ( addition + outStr );
	}
	
	void maxLengthWordInStr(String inpStr){
		String[] strArr = inpStr.split(" ");
		for (int i=0;i<strArr.length;i++){
			int strLength = strArr[i].length();
			if(strLength > maxWordLength){
				maxWordLength = strLength;
			}
		}
	}
	
	String leftAllignmentOfString(String inpStr){
		int spaceLength = maxWordLength - inpStr.length();
		String spaceStr = "";
		for(int i =0;i<spaceLength;i++){
			spaceStr += " ";
		}
		return spaceStr + inpStr;
	}
	
	void printOutPut(String inpStr){
		maxLengthWordInStr(inpStr);
		String[] strArr = inpStr.split(" ");
		for(int i=0;i<strArr.length;i++){
			strArr[i] = digitSumRearrange(strArr[i]);
			System.out.println(leftAllignmentOfString(strArr[i]));
		}
	}
	public static void main(String[] arg){
	String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
	new Assignment71().printOutPut(str);
	}
}