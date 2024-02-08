/*Assignment - 38 : 4th Feb'2024

Return the max & min number from given array.

input : [10,20,50,60,30]
output : min : 10 max : 60
*/

package madhura_kulkarni;

public class Assignment38 {
	
	
	void toFindmaxMinNum(int[] input) {
		int max=0, min=0;
for(int i=0;i<input.length;i++) {
	if(input[i]>max)
		max=input[i];
	else
		min=input[i];
}
System.out.println("Max & min number from given array are "+max+ " and "+min+ " respectively.");
	}

	public static void main(String[] args) {

	
		int[] arr= {10,20,50,60,30};
		Assignment38 ass = new Assignment38();
		ass.toFindmaxMinNum(arr);
	}

}
