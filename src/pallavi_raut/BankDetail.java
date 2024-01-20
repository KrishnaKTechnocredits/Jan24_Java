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
         printstatment method call count -> 2 */
		 
package pallavi_raut;
class BankDetail
{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printCount;
	
	void debitAmt(int amt){
		balance=balance-amt;
		debitCount++;
	}

	void creditAmt(int amt){
		balance=balance+amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Balance is:" + balance);
		printCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit count is:" + debitCount);
		System.out.println("Credit count is:" + creditCount);
		System.out.println("Print count is:" + printCount);	
	}

    public static void main( String[] args){
		BankDetail bankdetail=new BankDetail();
		bankdetail.debitAmt(300);
        bankdetail.printStatement();
		bankdetail.creditAmt(500);
		bankdetail.creditAmt(300);
		bankdetail.creditAmt(500);
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}	
	



