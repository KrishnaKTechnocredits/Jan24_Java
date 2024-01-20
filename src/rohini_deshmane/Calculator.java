package rohini_deshmane;

class Calculator {
     void add(int num1, int num2){
       
        System.out.println("num1 is "+num1+" num2 is "+num2+ " Sum is "+(num1+num2));
    }

    void sub(int num1, int num2){
       
        System.out.println("num1 is "+num1+" num2 is "+num2+ " Substraction is "+(num1-num2));
    }
    void div(int num1, int num2){
        
        System.out.println("num1 is "+num1+" num2 is "+num2+ " Division is "+(num1/num2));
    }
    void mul(int num1, int num2){
       
        System.out.println("num1 is "+num1+" num2 is "+num2+ " Multiplication is "+(num1*num2));
    }
    
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.add(23,45);
        calculator.sub(49,8);
        calculator.mul(4,9);
        calculator.div(8,4);
    }
}


