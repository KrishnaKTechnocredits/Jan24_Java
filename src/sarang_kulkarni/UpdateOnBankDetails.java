/*Assignment - 6 : 18th Jan'2024

Rewrite yesterday's BankDetails program with following condition.

1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance".
 if amount asked is less than equal to balance, then deduct the balance and print "User debited : " + amt. 
If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposit more than 5000 rs in one go" and amount 
should not be credited in main balance. 
If credited amount is negative, print "Invalid amount".*/

package sarang_kulkarni;

public class UpdateOnBankDetails {

	static int balance = 1000;

	void debit(int debAmt) {
		if(debAmt>balance) {
			System.out.println("Insufficient balance");
		}
		else if(debAmt<0) {
			System.out.println("Invalid Amount");
		}
		else
		balance = balance - debAmt;
	}

	void credit(int credAmt) {
		if(credAmt>5000) {
			System.out.println("You can't deposit more than 5000 Rs in one go");
		}
		else if(credAmt<0) {
			System.out.println("Invalid Amount");
		}
		else
		balance = balance + credAmt;
	}

	void printStatement() {
		System.out.println("Remaining balance is " + balance);
	
	}

	

	public static void main(String[] args) {
		UpdateOnBankDetails bankDetails = new UpdateOnBankDetails();
		bankDetails.debit(300);
		bankDetails.printStatement();
		bankDetails.debit(-200);
		bankDetails.printStatement();
		bankDetails.credit(6000);
		bankDetails.printStatement();
		bankDetails.credit(-700);
		bankDetails.printStatement();
		bankDetails.credit(500);
		bankDetails.printStatement();
	}

}
