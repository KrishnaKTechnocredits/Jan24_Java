package ashwini_b;

/*
Write a program that perform below operations

Init balance is 1000
Create 3 methods [debitAmt, creditsAmt, printBalance]

Inputs :
Debit -> 200
Credit -> 500
Credit -> 200
Debit -> 700

Output :
printBalance -> 800
*/

class AccountStatement{
 int balance = 1000;
 
      void debitAmt(int num1){
	  balance = balance - num1;
	 }
	 
	 void creditsAmt(int num1){
	  balance = balance + num1;
	  }
	 
	 void printBalance(){
	  System.out.println("Balance is " + balance);
	 }
	 
	 public static void main (String[] aregs){
	  AccountStatement accountStatement = new AccountStatement();
	   accountStatement.debitAmt(200); //800
	   accountStatement.creditsAmt(500); //1300
	   accountStatement.creditsAmt(200); //1500
	   accountStatement.debitAmt(700); //800
	   accountStatement.printBalance(); //800
	}
}	