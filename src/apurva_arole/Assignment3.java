package apurva_arole;

public class Assignment3 {
int balance=1000;
	
	void debitamt(int amt){
		balance=balance-amt;
	}
	void creditamt(int amt){
		balance=balance+amt;
	}
	void printbalance(){
		System.out.println(balance);
	}
	public static void main(String [] args){
	    Assignment3 assignment3 = new Assignment3();
	    assignment3.debitamt(200);
	    assignment3.creditamt(500);
	    assignment3.creditamt(200);
	    assignment3.debitamt(700);  
	    assignment3.printbalance();
	  }
}
