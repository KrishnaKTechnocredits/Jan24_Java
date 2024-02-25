package gaurav_garg;

class Manager {

	int id = 10;
	String mngName = "sai";

	void display() {
		System.out.println("Display child");
	}

	void getData() {
		System.out.println("GetData child");
	}
}

class Employee extends Manager {

	int id = 17;
	String empName = "java";

	void getData() {
		System.out.println("GetData Parent");
	}

	void printData() {
		System.out.println("PrintData child");
	}
}

public class InheritanceAssignment68 {

	void case1() {
		System.out.println("*******Case 1 : ***********");
		Manager Case1 = new Manager();
		System.out.println(Case1.id);
		System.out.println(Case1.mngName);
		Case1.display();
		Case1.getData();
	}

	void case2() {
		System.out.println("*******Case 2 : ***********");
		Employee Case2 = new Employee();
		// all members , property of parents travels to the child class if same then
		// override it
		System.out.println(Case2.id);
		System.out.println(Case2.mngName);
		System.out.println(Case2.empName);
		Case2.display();
		Case2.getData();
		Case2.printData();
	}

	void case3() {
		System.out.println("*******Case 3 : ***********");
		Manager Case3 = new Employee();
		// This is Dynamnic Polymorphism. Property will run of child class. method
		// envirnoment will change so run of parent class
		System.out.println(Case3.id); // child class property run
		System.out.println(Case3.mngName); // child class property run
		Case3.display(); // parent method run
		Case3.getData(); // parent method run
		// Case3.printData(); (not match in child class mapping)

	}

	void case4() {
		System.out.println("*******Case 4 : ***********");
		System.out.println("not valid case");
		/*
		 * Employee Case2 = new Manager(); // this case is not possible ,Employee is
		 * subclass. System.out.println(Case2.id); System.out.println(Case2.mngName);
		 * System.out.println(Case2.empName); Case2.display(); Case2.getData();
		 * Case2.printData();
		 */
	}

	void case5() {
		System.out.println("*******Case 5 : ***********");
		Manager Case5a = new Employee();
		Employee Case5b = new Employee();
		Case5a = Case5b;
		// left side to right side so Manager Case5a = new Employee();
		System.out.println(Case5a.id); // child class property run
		System.out.println(Case5a.mngName); // child class property run
		Case5a.display(); // parent method run
		Case5a.getData(); // parent method run
	}
	
	void case6() {
		System.out.println("*******Case 6 : ***********");
		Manager Case6a = new Employee();
		Manager Case6b = new Manager();
		Case6a = Case6b;
		// left side to right side so Manager Case6b = new Manager();;
		System.out.println(Case6a.id);
		System.out.println(Case6a.mngName);
		Case6a.display();
		Case6a.getData();
	}

	public static void main(String[] args) {
		InheritanceAssignment68 inheritanceAssignment68 = new InheritanceAssignment68();
		inheritanceAssignment68.case1();
		inheritanceAssignment68.case2();
		inheritanceAssignment68.case3();
		inheritanceAssignment68.case4();
		inheritanceAssignment68.case5();
		inheritanceAssignment68.case6();
	}
}
