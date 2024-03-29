package akshay_gaikwad;
/*Assignment - 94 : 25th March'2024 [18-20 mins] 
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
10:06 :: 10 :12*/

class ReverseWordString{

	String printWordReverseOrder(String str){
		String [] strArr = str.split(" ");
		String output = "";
		for(int index = strArr.length-1 ; index >=0; index--){
			output += strArr[index] + " "; 
		}
		return output;
	}
	
	public static void main(String[] args){
		String input = "Kajol is Working in Roche";
		String output = new ReverseWordString().printWordReverseOrder(input);
		System.out.println(output);
	}
}