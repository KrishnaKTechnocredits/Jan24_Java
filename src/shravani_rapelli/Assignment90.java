package shravani_rapelli;

public class Assignment90 {
	
	void findMaxConsecutives1(int arr[]) {
		int count = 0;
		int maxCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
				if(maxCount<count)
					maxCount = count;
			}else {
				count = 0;
			}
		}
		System.out.println("Maximum consecutive 1's in an array : " + maxCount);
	}
	
	public static void main(String[] args) {
		Assignment90 assgn90 = new Assignment90();
		int arr[] = {0,0,1,0,0,1,1,0,1,1,1,0};
		assgn90.findMaxConsecutives1(arr);
	}
}
