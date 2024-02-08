/*Assignment - 33 : 4th Feb'2024

Return the sum of all given array of double type.

input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31*/

package madhura_kulkarni;

public class Assignment33 {

	void printSumOfElementsInArray(double[] input)
	{
		double sum=0.0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("Sum of all elements in double array: "+sum);
	}
	
	public static void main(String[] args) {
		double arr[]= {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		Assignment33 ass= new Assignment33();
		ass.printSumOfElementsInArray(arr);
	}

}
