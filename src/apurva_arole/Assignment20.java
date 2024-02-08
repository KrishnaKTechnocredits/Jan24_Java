package apurva_arole;

public class Assignment20{
	void printnum(int startindex, int endindex){
		int num=0;
		for(int i=startindex;i<=endindex;i++) {
			if(i%2==0 &&num<5) {
				System.out.println(i);
				num++;	
			}
		}
}
	void printnum1(int startindex, int endindex) {
	    int i=startindex, num =0;
	            System.out.println();
	do {
		if(i%2==0 && num <5) {
			    System.out.println(i);
			    num++;
		}
		i++;
	} while(i<= endindex&& num <5);
}

    void printnum2(int startindex, int endindex) {
	    int i= startindex, num =0;
	            System.out.println();
	while (i<=endindex && num <5) {
		if(i%2 ==0) {
			    System.out.println(i);
			    num++;
		}
		i++;
	}
}
    public static void main(String[] args) {
	     Assignment20 assignment20 = new Assignment20();
	     assignment20.printnum(10, 30);
	     assignment20.printnum1(10, 30);
	     assignment20.printnum2(10, 30);
    }
}