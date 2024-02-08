package lovekesh_mishra;

class MaxAndMinAssignment38 {

	void max(int[] num) {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("maximum number from given array is---> " + max);
	}

	void min(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("minimum number from the given array is---> " + min);
	}

	public static void main (String[] args) {
	    	MaxAndMinAssignment38 ans = new MaxAndMinAssignment38();
	    	int[] num = {10, 20, 50, 60, 30};
	    	ans.max(num);
	    	ans.min(num);
	    	
	    }
}
