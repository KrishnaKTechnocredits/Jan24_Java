package rohini_deshmane;

class CalculatorTricky {
    int grandTotal;
    void add(int num1, int num2){
        grandTotal = grandTotal +(num1 + num2);
    }
    void sub(int num1, int num2){
        grandTotal = grandTotal +(num1 - num2);
    }
    void div(int num1, int num2){
        grandTotal = grandTotal +(num1 / num2);
    }
    void mul(int num1, int num2){
        grandTotal = grandTotal +(num1 * num2);
    }
    void disply() {
        System.out.println("\n\n Grand Total = "+grandTotal+"\n\n");
    }
    public static void main(String args[]) {
        CalculatorTricky calculator = new CalculatorTricky();
        calculator.add(23,45);
        calculator.sub(49,8);
        calculator.mul(4,9);
        calculator.div(8,4);
        calculator.disply();
    }
}


