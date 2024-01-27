package nisarg_patel;

/*
reate a call called BankDetail. Instance variable can be,

balance = 1000, debitCount, creditCount, printStatementCount


1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, 
printCountInfo : printCountInfo should print,

remaining balance

how many times Debit operation performed

how many times Credit operation performed

how many times PrintStatement operation performed

input : debitAmt(300)
        printStatement()
		creditAmt(500)
		creditAmt(300)
		creditAmt(500)
		printStatement()
		printCountInfo()
		
output : remaining balance is 700
         remaining balance is 2000
         debit method call count -> 1
         credit method call count -> 3
         printstatment method call count -> 2*/


class Assignment5BankTransaction{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		this.balance = balance - amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		this.balance = balance + amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remaining Blance" + balance);
		
	}
	
	void countStatement(){
		System.out.println("Debit Count" + debitCount);
		System.out.println("credit Count" + creditCount);
		System.out.println("PrintStatement Count" + printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment5BankTransaction assignment5BankTransaction = new Assignment5BankTransaction();
		assignment5BankTransaction.debitAmt(300);
		assignment5BankTransaction.printStatement();
		assignment5BankTransaction.creditAmt(500);
		assignment5BankTransaction.creditAmt(300);
		assignment5BankTransaction.creditAmt(500);
		assignment5BankTransaction.printStatement();
		assignment5BankTransaction.countStatement();
	}
}