/*Assignment - 6 : 18th Jan'2024
Rewrite yesterday's BankDetails program with following condition.
1. If debitAmt is more than balance, asked amount should not be deducted from 
balance and you should print "Insufficient balance". if amount asked is less than  
equal to balance, then deduct the balance and print "User debited : " + amt. 
If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print
 "You can't deposite more than 5000 rs in one go" and amount should not be credited in 
 main balance. If credited amount is negative, print "Invalid amount".*/

package prathamesh_tati;

public class BankCreditDebitInfo {

		int balance = 1000;
		int debitCount;
		int creditCount;
		int printStatementCount;
		
		void debitAmt(int amt){
			if(amt > balance){
				System.out.println("Insufficient Balance");
			} else if (amt < 0){
				System.out.println("Invalid amount");
			} else{
				balance = balance - amt;
				System.out.println("Your debit Amount = " + amt);
				debitCount++;
			}
		}
		
			void creditAmt(int amt){
			if(amt > 5000){
				System.out.println("You can't deposite more than 5000 rs in one go");
			} else if(amt < 0){
				System.out.println("Invalid amount");
			} else{
				balance = balance + amt;
				System.out.println("Your credit Amount = " + amt);
				creditCount++;
			}
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
			BankCreditDebitInfo bankCreditDebitInfo = new BankCreditDebitInfo();
			bankCreditDebitInfo.debitAmt(7000);
			bankCreditDebitInfo.debitAmt(-900);
			bankCreditDebitInfo.debitAmt(300);
			bankCreditDebitInfo.printStatement();
			bankCreditDebitInfo.creditAmt(8000);
			bankCreditDebitInfo.creditAmt(-500);
			bankCreditDebitInfo.creditAmt(500);
			bankCreditDebitInfo.creditAmt(300);
			bankCreditDebitInfo.creditAmt(500);
			bankCreditDebitInfo.printStatement();
			bankCreditDebitInfo.printCountInfo();
		}
	}
