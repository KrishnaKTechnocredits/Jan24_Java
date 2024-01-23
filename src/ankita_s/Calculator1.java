package ankita_s;

class Calculator1{

 void addition(int num1,int num2){
  System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", addition = " + (num1+num2));
 }
  
 void subtraction(int num1,int num2){
  System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", subtraction = " + (num1-num2));
 }
  
 void multiplication(int num1,int num2){
  System.out.println("num1 is "+ num1 + ", num2 is "+ num2 + ", multiplication = " + (num1*num2));
 }
  
 void division(int num1,int num2){
  System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", division = " + (num1/num2));
 }
  
 public static void main(String[] agrs){
   Calculator1 calculator1=new Calculator1();
   calculator1.addition(20,30);
   calculator1.subtraction(50,22);
   calculator1.multiplication(50,5);
   calculator1.division(200,10);
 }
}   
  
  
 