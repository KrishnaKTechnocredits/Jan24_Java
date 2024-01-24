package kanchan_ghuge;

class Assignment3{
	
	int balance = 1000;
	
	void debitAmount(int amt){
		balance = balance - amt; 
		System.out.println("DebitAmount= " + balance);
	}    
		
		
	void creditAmount(int amt){ 
	    balance = balance + amt;
		System.out.println("CreditAmount= " + balance);
	}
	
	void printBalance(){
		System.out.println("Balance= " + balance);
	}

    public static void main(String [] args){
	    Assignment3 assignment3 = new Assignment3();
        assignment3.debitAmount(200);
        assignment3.creditAmount(500);
	    assignment3.creditAmount(200);
	    assignment3.debitAmount(700);
        assignment3.printBalance();
	}
}
	