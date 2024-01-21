/*Assignment - 5 : 17th Jan'2024

Create a call called BankDetail. Instance variable can be,

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

package phenol_verma;

class BankDetail {
	static int balance = 1000, debitCount, creditCount, printStatementCount;

	void DebitAmt(int amt){
		balance = balance - amt;
		debitCount++;		
	}
	
	void CreditAmt(int amt){
		balance = balance + amt;
		creditCount++;		
	}
		
	void printStatement(){
		System.out.println("remaining balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount);
		System.out.println("printstatment method call count -> " + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.DebitAmt(300);
		bankDetail.printStatement();
		bankDetail.CreditAmt(500);
		bankDetail.CreditAmt(300);
		bankDetail.CreditAmt(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}	
}