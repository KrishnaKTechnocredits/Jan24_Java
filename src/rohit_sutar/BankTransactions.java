package rohit_sutar;

class BankTransactions{
	int debitCount, creditCount, statementCount;
	int balance = 1000;
	
	void debitAmount(int amount){
		balance = balance - amount;
		debitCount++;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
		creditCount++;
	}
	
	void accountBalance(){
		System.out.println("Current Balance is : "+balance);
		statementCount++;
	}
	
	void printCount(){
		System.out.println("Balance is: "+balance);
		System.out.println("Number of times Debit Method Count: "+debitCount);
		System.out.println("Number of times Credit Method Count: "+creditCount);
		System.out.println("Number of times accountBalance Method Count: "+statementCount);
	}
	
	public static void main(String args[]){
		BankTransactions bankTransactions = new BankTransactions();
		bankTransactions.debitAmount(300);
		bankTransactions.printCount();
		bankTransactions.creditAmount(500);
		bankTransactions.creditAmount(300);
		bankTransactions.creditAmount(300);
		bankTransactions.accountBalance();
		bankTransactions.printCount();
	}
}
