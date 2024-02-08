package hiral_purohit;

public class MaxAndNMinNoOfArray {
	
	int maxNumberArray(int[]max) {
		int maximum = max[0];
		for(int index=0; index< max.length; index++) {
			if(maximum < max[index]) {
				maximum = max[index];
			}
		}System.out.println("maximum nuber of String is: " +maximum);
		return maximum;
	}
	int minNumberArray(int[]min) {
		int minimum = min[0];
		for(int index=0; index< min.length; index++) {
			if(minimum > min[index]) {
				minimum = min[index];
			}
		}System.out.println("min number of String is: " + minimum);
		return minimum;
	}
	 
	public static void main (String[] args) {
		int[]arr= {10,20,50,60,30};
		MaxAndNMinNoOfArray maxAndNMinNoOfArray = new MaxAndNMinNoOfArray();
		maxAndNMinNoOfArray.maxNumberArray(arr);
		maxAndNMinNoOfArray.minNumberArray(arr);
	}
}
