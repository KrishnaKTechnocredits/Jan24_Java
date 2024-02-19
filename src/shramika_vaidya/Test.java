package shramika_vaidya;
//AllCasesOfInheritance 

class Manager {
	int id = 10;
	String mngName = "sai";

	void display() {
		System.out.println("Techno");
	}

	void getData() {
		System.out.println("credits");
	}
}

class Employee1 extends Manager {
	int id = 17;
	String empName = "java";

	void getData() {
		System.out.println("Bio");
	}

	void printData() {
		System.out.println("Systema");
	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println("case1:");
		Manager manager = new Manager();
		System.out.println(manager.id);
		System.out.println(manager.mngName);
		// System.out.println(manager.empName); ->CE [manager can access only those
		// variables which are
		// in Manager class because Manager is refer type]
		manager.display();
		manager.getData();
// -----------------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("case2:");
		Employee1 emp = new Employee1();
		System.out.println(emp.id);
		System.out.println(emp.mngName); // all members of parents travels to the child class hence child is able to
//													 access all,if same name variables or methods are also available in child
//													 class then priority goes to child class members.
		System.out.println(emp.empName);
		emp.display();
		emp.getData();
		emp.printData();

		// -----------------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("case3:");
		Manager mg = new Employee1();
		System.out.println(mg.id);
		System.out.println(mg.mngName);
//				System.out.println(mg.empName);// child class methods or variables dose not travel to parent class
		mg.display();
		mg.getData();// at compile time execute the behavior of parent class but at runtime executes
//								 the behavior of child class
//		mg.printData();- // subclass member can't be access by superclass,here refer type is of parent class
//		                    hence only parent class members will be access.
		// --------------------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("case4:");
		// Employee em = new Manager(); // this case is not possible ,Employee is
		// subclass.
		System.out.println("not valid case");

		// -----------------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------------");
		System.out.println("case5:");
		Manager m = new Employee1();
		Employee1 e = new Employee1();
		m = e;
		System.out.println(m.id);
		System.out.println(m.mngName);
//		System.out.println(m.empName); this will work exact as case 3: it just that you
		// have created object twice but assigning the value of e to m (m=e).hence both
		// are pointing to the same location.
		m.display();
		m.getData();
//				m.printData() //subclass member can't be access by superclass.
// ------------------------------------------------------------------------------------------------------
// case 6
		System.out.println("---------------------------------------------");
		System.out.println("case6:");
		// Manager m3 = new Employee(); // this case is not possible CE can not assign
		// parent to child class.
		// Employee e2 = new Employee();
		// e2=m3;
		System.out.println("not valid case");
	}
}
