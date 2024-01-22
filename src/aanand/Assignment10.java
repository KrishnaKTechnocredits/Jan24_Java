package aanand;

public class Assignment10 {
	
	void evenNumber(int startNum, int endNum) {
		for(int index = startNum; index <= endNum; index++) {
			if(index % 2 ==0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.evenNumber(10, 15);

	}

}
