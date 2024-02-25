package sasmita;

public class Assignmentt64 {

	void printSumofDeciaml(String str) {
		double d=0;
		int sum=0;
		String input = "";
		String temp="";
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(ch=='.') {
				input= temp + str.charAt(index-1)+ ch +str.charAt(index+1);
				double value= Double.parseDouble(input);
				d= d+ value;
			}else if(Character.isDigit(ch) && str.charAt(index+1)!= '.'&& str.charAt(index-1)!='.'){
			sum= sum + Character.getNumericValue(ch);
		}
		}
		System.out.println("sum of number and decial are :" +(sum+d));
	
	}



	public static void main(String[] args) {
		Assignmentt64 assignmentt64= new Assignmentt64();
		assignmentt64.printSumofDeciaml("te3ch4.5noc7red8.1its");
	

	}

}
