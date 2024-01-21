package apurva_arole;

public class Assignment5 {
	int balance = 1000 ,debitcount , creditcount, Printstatementcount ;		
	void debitamt(int amt){
		balance = balance - amt;
		debitcount++;
	}
	void creditamt(int amt){
		balance = balance + amt;
		creditcount++;
	}	
	void Printstatement(){
		System.out.println("remaining balance is " +balance);
		Printstatementcount++;
	}	
	void printcountinfo(){
	    System.out.println("debit count is "  + debitcount);	
	    System.out.println("credit count is "  + creditcount);	
	    System.out.println("printstatementcount is " + Printstatementcount);	
	}
	public static void main(String [] args)
    {
        Assignment5 assignment5 = new Assignment5();
        assignment5.debitamt(300);
	    assignment5.Printstatement();
	    assignment5.creditamt(500);
	    assignment5.creditamt(400);
	    assignment5.creditamt(600);
	    assignment5.Printstatement();
	    assignment5.printcountinfo();
    }
}

