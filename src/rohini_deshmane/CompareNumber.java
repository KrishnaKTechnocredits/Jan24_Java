package rohini_deshmane;

class CompareNumber {

    void findBiggerNumber(int num1, int num2){
        if(num1 > num2) {
            System.out.println(num1 + " is bigger between "+ num1+" and "+num2);
        }
        else {
            System.out.println(num2 + " is bigger between "+ num1+" and "+num2);
        }
    }  

    void findSmallerNumber(int num1, int num2){
        if(num1 < num2) {
            System.out.println(num1 + " is Smaller between "+ num1+" and "+num2);
        }
        else {
            System.out.println(num2 + " is Smaller between "+ num1+" and "+num2);
        }
    }  
    public static void main(String args[]) {
        CompareNumber compareNumber = new CompareNumber();
        compareNumber.findBiggerNumber(34, 67);
        compareNumber.findSmallerNumber(45, 34);
    }
}