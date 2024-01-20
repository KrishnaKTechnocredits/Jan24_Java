package rohini_deshmane;

class BankDetails {
    int balance = 1000;
    int debitCount, creditCount, printcount;

    void debitAmt(int amt){
        balance = balance-amt;
        debitCount++;
    }

    void creditAmt(int amt){
        balance = balance+amt;
        creditCount++;
    }
    
    void printStatementCount() {
        System.out.println("Remaining Balance is "+ balance);
        printcount++;
    }
    
    void printCountInfo() {
        System.out.println("Debit Count "+ debitCount+ "\nCredit count "+ creditCount + "\nPrint count "+printcount);
    }
    
    public static void main(String args[]) {
        BankDetails bank = new BankDetails();
        bank.debitAmt(300);
        bank.printStatementCount();
        bank.creditAmt(500);
        bank.creditAmt(300);
        bank.creditAmt(500);
        bank.printStatementCount();
        bank.printCountInfo();
    }
}