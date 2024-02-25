/*
 * Assignment - 5 : 17th Jan'2024

Create a call called BankDetail. Instance variable can be,

balance = 1000, debitCount, creditCount, printStatementCount


1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, 
printCountInfo : printCountInfo should print,

Remaining balance
How many times Debit operation performed
How many times Credit operation performed
How many times PrintStatement operation performed

input :      debitAmt(300)
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
package sarang_kulkarni;

public class BankDetails {

	static int balance = 1000, cnt1 = 0, cnt2 = 0, cnt3 = 0;

	void debit(int debAmt) {
		balance = balance - debAmt;
		cnt1++;
	}

	void credit(int credAmt) {
		balance = balance + credAmt;
		cnt2++;
	}

	void printStatement() {
		System.out.println("Remaining balance is " + balance);
		cnt3++;
	}

	void methodCallCount() {
		System.out.println("Creadit method call count -> " + cnt1);
		System.out.println("Debit method call count -> " + cnt2);
		System.out.println("Print statement method call -> " + cnt3);
	}

	public static void main(String[] args) {
		BankDetails bankDetails = new BankDetails();
		bankDetails.debit(300);
		bankDetails.printStatement();
		bankDetails.credit(500);
		bankDetails.credit(300);
		bankDetails.credit(500);
		bankDetails.printStatement();
		bankDetails.methodCallCount();
	}

}
