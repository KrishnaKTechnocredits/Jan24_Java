package madhura_kulkarni.oops_concepts_programs;

public class InheritanceAllCases {

	public static void main(String[] args) {
		System.out.println("Inheritance : Case 1");
//In case 1, create an object of parent class. Only the variables and methods in parent class should be accessible.
		Manager case1 = new Manager();
		System.out.println(case1.managerId);
		case1.printId();
//System.out.println(case1.empId);  
//case1.printEmpId();
//Getting an error while calling variables & methods from employee class as those are called on the object of parent class.

		System.out.println("\nInheritance : Case 2");
		// In case 2, create an object of child class. Only the variables and methods in
		// child class should be accessible.
		Employee case2 = new Employee();
		System.out.println(case2.empName);
		case2.printName();
		// System.out.println(case2.managerId);
		// System.out.println(case2.managerName);
		// Getting an error while calling variables & methods from parent(Manager) class
		// as those are called on the object of child class.

		System.out.println("\nInheritance : Case 3");
		// In case 3, create an object of child class taking reference from the parent
		// class. On the compile time, compiler gives guarantee of parent class but at
		// run time, the methods from child class will get executed. This run time
		// change in behavior is Dynamic Polymorphism.
		Manager case3 = new Employee();
		case3.printId();
		case3.printName();

		System.out.println("\nInheritance : Case 4");
		// In case 4, create an object of parent class taking reference from the child
		// class. On the compile time, compiler gives an error as the parent to child
		// assignment is not possible.
		/*
		 * Employee case4 = new Manager(); case4.printId(); case4.printName();
		 */

		System.out.println("\nInheritance : Case 5");
		/*
		 * In case5, the behavior is same as like case3.
		 * 
		 */
		Manager case5 = new Employee();
		Employee case2_1 = new Employee();
		case5 = case2_1;
		System.out.println(case5.managerId);
		System.out.println(case5.managerName);
		// System.out.println(case5.empId); // CE
		case5.printId();
		case5.printName();

		System.out.println("\nInheritance : Case 6");
		/*
		 * In case6, the compiler gives an error while creating an object as parent to
		 * child assignment is not possible. Employee case6 = new Employee(); Manager
		 * case3_1 = new Manager(); case6 = case3_1;
		 * System.out.println(case6.managerId); System.out.println(case6.managerName);
		 * //System.out.println(case5.empId); // CE case6.printId(); case6.printName();
		 */
	}
}
