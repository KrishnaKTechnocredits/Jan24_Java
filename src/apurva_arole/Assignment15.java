package apurva_arole;

public class Assignment15 {
	void printnum(int startindex,int Endindex){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 & 4 is\n");
		for(int i=startindex;i<=Endindex;i++){
			if(i%3==0 && i%14==0){
				System.out.println(i+"\n");
				count++;
			}
		        if(count==3){
			          break;
		       }
			}
		}
	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		assignment15.printnum(10,500);
	}
}
