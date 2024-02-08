package shravani_rapelli;

public class Assigment21 {
	
	int count;
	
	void minNumbers() {
		int sum=0;
		int num=1;
		while(sum<=150) {
			if(num%6 == 0) {
				sum= sum+num;
				count++;
			}
			num++;
		}
		System.out.println("Result:"+ count);
	}
	
	public static void main(String[] args) {
		Assigment21 assign21 = new Assigment21();
		assign21.minNumbers();
		
	}

}
