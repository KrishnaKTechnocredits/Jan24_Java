package apurva_arole;

public class Assignment2 {
	int balance=1000;
				
	 void debitamt(int amt){
		balance = balance - amt;
	 }
	 void creditamt(int amt){
		balance = balance + amt;
	 }
	 void PrintBalance() {
		System.out.println("Total balance is =" + balance);
	 }
	 public static void main(String[] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.debitamt(200);
		assignment2.creditamt(500);
		assignment2.creditamt(700);
		assignment2.debitamt(800);
		assignment2.PrintBalance();
	}
}
