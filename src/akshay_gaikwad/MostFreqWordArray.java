package akshay_gaikwad;
/*
program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.
30 mins
*/

class MostFreqWordArray{
	
	int countOfString(String name, String[] strArr){
		int count = 0;
		for(String currStr : strArr){
			if(name.equals(currStr)){
				count++;
			}
		}
		return count;
	}
	
	boolean isProcessed(String name, int i, String[] strArr){
		for(int index = 0; index < i; index++){
			if(strArr[index].equals(name)){
				return true;
			}
		}
		return false;
	}
	
	void printMostFreqWord(String str){
		String [] strArr = str.split(" ");
		int maxCount = 0;
		String maxCountWord = "";
		
		for(int index = 0; index < strArr.length; index++){
			String name = strArr[index];
			if(!isProcessed(name, index, strArr)){
				int countCurrStr = countOfString(name,strArr);
				System.out.println(name + " -> " + countCurrStr);
				if(countCurrStr > maxCount){ 
					maxCount  = countCurrStr;
					maxCountWord = name;
				}
			}
		}
		System.out.println("Most frequent word in given string is " + maxCountWord + " having frequency of " + maxCount);
	}
	
	public static void main(String [] args){
		String input = "abc xyz abc pqr";
		new MostFreqWordArray().printMostFreqWord(input);
	}
}
