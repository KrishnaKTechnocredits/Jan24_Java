package kanchan_ghuge;

class Assignment6{
	int balance=1000;
	
	void debitAmt(int amt){
	    if (amt > balance){
		   System.out.println("Insufficient Balance for Debit");
		}
		else if (amt <= balance){
			balance = balance - amt;
		    System.out.println("User Debited = " + amt);
		}
		else if (amt <= 0){
		    System.out.println("Invalid Amount for Debit");
		}	
	}
    
    void creditAmt(int amt){
		if (amt > 5000){
			System.out.println("User Cant deposite 5000 rs in one go");
		}	
		else if(amt <= 0){
		    System.out.println("Invalid Amount for Credit");
		}	
	}

    public static void main(String [] args){
    	Assignment6 assignment6 = new Assignment6();
        assignment6.debitAmt(-1);
        assignment6.creditAmt(-1);
	}
}
	