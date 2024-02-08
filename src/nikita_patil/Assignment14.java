package nikita_patil;

public class Assignment14 {
	void printsum(int startindex, int Endindex){
		int sum=0;
		for(int i=startindex;i<=Endindex;i++){
			if(i%5==0 && i%10==0)
				sum=sum+i;
			}
		  System.out.println("Expected sum is=" +sum);
	}
	public static void main(String[] args){
		Assignment14 a = new Assignment14();
		a.printsum(10,50);
	}
}


