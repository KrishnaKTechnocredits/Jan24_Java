/*Assignmnet 37
Print all the names with their frequency from given array.*/

package shraddha;

public class FerquencyOfName {
	int length=0;
	void frequency(String[] str){
		for(int i=0;i<str.length;i++){
			length = str[i].length();
			System.out.println("Count of characters in "+str[i]+" = "+length);
		}
	
	}
	
	public static void main(String[] args) {
		FerquencyOfName frequecy1 = new FerquencyOfName();
		String[] str= {"Shraddha","Techno","Java","Credits"};
		frequecy1.frequency(str);
		
		
	}
}

