package rohini_deshmane.string_programs;

import java.util.ArrayList;

/*
 
I__am___in_pune____

output : I -> 2
         am -> 3
		 in -> 1
         pune -> 4
         
 */

public class SpecialCharCount {
	
	ArrayList<String> getArrayList(String str) {
		String stringCh="";
		ArrayList<String> stringChList = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				stringCh=stringCh+str.charAt(i);
			} else if(!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))){
					if(!stringCh.isBlank()){
						stringChList.add(stringCh);
						stringCh="";
					}
			}
		}
		return stringChList;
		
	}
	
	ArrayList<Integer> getCountOfSpecialChar(ArrayList<String> arrList,  String str) {
		int count=0;
		String stringCh="";
		ArrayList<Integer> stringCountList = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				stringCh=stringCh+str.charAt(i);
			} else if(!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))){
				count++;
				if((i+1) != str.length()) {
					if(Character.isAlphabetic(str.charAt(i+1))) {
						stringCountList.add(count);
						count=0;
					}
				} else  {
					stringCountList.add(count);
				}
			}
		}
		return stringCountList;
	}
	
	void printArraylist(ArrayList<String> arrList, ArrayList<Integer> arrCountList) {
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i)+" --> "+arrCountList.get(i));
		}
	}
	
	public static void main(String[] args) {
		String str = "I__am___in_pune____";
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayCountList = new ArrayList<>();
		SpecialCharCount specialCharCount = new SpecialCharCount();
		arrayList = specialCharCount.getArrayList(str);
		arrayCountList = specialCharCount.getCountOfSpecialChar(arrayList, str);
		specialCharCount.printArraylist(arrayList, arrayCountList);
	}

	
}
