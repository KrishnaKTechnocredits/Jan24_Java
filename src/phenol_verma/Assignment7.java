/*Assignment - 7 : 18th Jan'2024
Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.*/
package phenol_verma;

class Assignment7 {
		
	void maximum(int num1, int num2){
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		if(num1 > num2){
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		} else {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		}		
	}
	
	void minimum(int num1, int num2){
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		if(num1 < num2){
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}		
	}
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.maximum(10,17);
		assignment7.minimum(10,17);
	}
}