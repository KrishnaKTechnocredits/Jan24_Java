package aanand;

public class Assignment11 {
	void divisibleBy3And5(int startNum, int endNum) {
		for(int index = startNum; index <= endNum; index++) {
			if(index % 3 == 0 && index % 5 == 0) {
				{
					System.out.println(index);
				}
			}
		}
	}
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.divisibleBy3And5(5, 40);
	}

}
