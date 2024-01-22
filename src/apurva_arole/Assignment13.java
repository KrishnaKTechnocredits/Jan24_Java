package apurva_arole;

public class Assignment13{
	int i=0;
	void printnum(int startIndex, int EndIndex){
		for(int num=startIndex;num<=EndIndex;num++){
			if(num%5==0 && num%9==0){
			   i=num;
			}
		}
		 System.out.println("Last number divisible by 5 & 9 is :"+ i);
	}
	public static void main(String[] args){
		       Assignment13 assignment13 = new Assignment13();
		       assignment13.printnum(5,100);
	}
}
