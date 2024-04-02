package shridhar_k;
// [18-20 mins] 8.17 - 8.30 , 8.31 8.39
// 1. WAP for swapping of two integers without using third variable.
// 2. WAP for swapping of two String without using third variable.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Assignment93 {
    
    void printSwapInteger(int num1 , int num2){
        System.out.println("Input "+ num2 + " and " + num1);
        num1 = num1 + num2;
        num2 = num1  - num2;
        num1 = num1 - num2;
        
        System.out.println( "output "+ num1 + " and " + num2);
    }
    
    void printSwapString(String str1 , String str2){
        System.out.println("Input "+ str1 + " and " + str2);
        str1 = str1 + " " + str2;
        str2 = str1 + " " + str2;
        
        str1 = str1.split(" ")[1];
        str2 = str2.split(" ")[0];
        
        System.out.println("output "+ str1 + " and " + str2);
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 17;
        String str1 = "Akshay";
        String str2 = "Shri";
        new Assignment93().printSwapInteger(num1 , num2);
        System.out.println();
        new Assignment93().printSwapString(str1 , str2);
    }
}