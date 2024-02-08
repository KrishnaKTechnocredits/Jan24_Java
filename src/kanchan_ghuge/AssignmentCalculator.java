package kanchan_ghuge;

class AssignmentCalculator {

	void add(int num1, int num2) {
		System.out.println("num1 is " + num1 + ",num2 is " + num2 + ",Addition=" + (num1 + num2));
	}

	void sub(int num1, int num2) {
		System.out.println("num1 is " + num1 + ",num2 is " + num2 + ",Substraction=" + (num1 - num2));
	}

	void div(int num1, int num2) {
		System.out.println("num1 is " + num1 + ",num2 is " + num2 + ",Division=" + (num1 / num2));
	}

	void mul(int num1, int num2) {
		System.out.println("num1 is " + num1 + ",num2 is " + num2 + ",Multiplication=" + (num1 * num2));
	}

	public static void main(String[] args) {
		AssignmentCalculator assignmentCalculator = new AssignmentCalculator();
		assignmentCalculator.add(20, 30);
		assignmentCalculator.sub(50, 22);
		assignmentCalculator.div(200, 10);
		assignmentCalculator.mul(50, 5);
	}
}