package kanchan_ghuge;

/*Assignment - 33 : 4th Feb'2024

Return the sum of all given array of double type.

input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31
*/

class Assignment33{    
    double sum=0;
	
    void sumOfDoubleType(double[] num){
	    for(int index=0;index<num.length;index++){
		//System.out.println(num[index]);
		sum=sum + num[index];
		}
		System.out.println("Sum of all given array of double type = " + sum);
	}	

	public static void main(String[] args){
	    double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
	    new Assignment33().sumOfDoubleType(arr);
	}
}	