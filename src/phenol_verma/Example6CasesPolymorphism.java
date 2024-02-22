/*
 * AllCasesOfInheritance
 * PhenolV_Assignment_74
 */

/*
 * package phenol_verma;

public class PolymorphismEmployee extends PolymorphismMamager {
	
	int id = 17;
	String empName = "java";

	void getData() {
		System.out.println("Bio");
	}

	void printData() {
		System.out.println("Systema");
	}

}

 */

/*
 * package phenol_verma;

public class PolymorphismMamager {
	
	int id = 10;
	String mngName = "sai";

	void display() {
		System.out.println("Techno");
	}

	void getData() {
		System.out.println("credits");
	}
}



 */

package phenol_verma;

public class Example6CasesPolymorphism {

	public static void main(String[] args) {

		System.out.println("****************Case 1 : ****************");
		PolymorphismMamager polymorphismMamagerCase1 = new PolymorphismMamager();
		System.out.println(polymorphismMamagerCase1.id);
		System.out.println(polymorphismMamagerCase1.mngName);
//	    System.out.println(manager.empName); // compilation error, parent can access only those variables which are in parent class because parent is refer type
		polymorphismMamagerCase1.display();
		polymorphismMamagerCase1.getData();

		System.out.println("****************Case 2 : ****************");
		PolymorphismEmployee polymorphismEmployeeCase2 = new PolymorphismEmployee();
		System.out.println(polymorphismEmployeeCase2.id);
		System.out.println(polymorphismEmployeeCase2.mngName); // all members of parents travels to the child class
																// hence child is able to access all,if same name
																// variables or methods are also available in child
																// class then priority goes to child class members.
		System.out.println(polymorphismEmployeeCase2);
		polymorphismEmployeeCase2.display();
		polymorphismEmployeeCase2.getData();
		polymorphismEmployeeCase2.printData();

		System.out.println("****************Case 3 : ****************");
		PolymorphismMamager polymorphismMamagerCase3 = new PolymorphismEmployee();
		System.out.println(polymorphismMamagerCase3.id);
		System.out.println(polymorphismMamagerCase3.mngName);
//		System.out.println(mg.empName);// child class methods or variables dose not travel to parent class.
		polymorphismMamagerCase3.display();
		polymorphismMamagerCase3.getData(); // at compile time execute the behavior of parent class but at runtime
											// executes the behavior of child class,
											// polymorphismMamagerCase3.printData();- subclass member can't be access by
											// superclass, here refer type is of parent class hence only parent class
											// members can be accessible

		System.out.println("****************Case 4 : ****************");
//	    Employee polymorphismEmployeeCase2 = new Manager(); // this case is not possible , PolymorphismEmployee is subclass.
		System.out.println("not valid case");

		System.out.println("****************Case 5 : ****************");
		PolymorphismMamager polymorphismMamagerCase5 = new PolymorphismEmployee();
		PolymorphismEmployee PolymorphismEmployeeCase5 = new PolymorphismEmployee();
		polymorphismMamagerCase5 = PolymorphismEmployeeCase5;
		System.out.println(polymorphismMamagerCase5.id);
		System.out.println(polymorphismMamagerCase5.mngName);
//		System.out.println(polymorphismMamagerCase5.empName); this will work exact as case 3: it just that you have created object twice but assigning the value of PolymorphismEmployeeCase5 to polymorphismMamagerCase5, (polymorphismMamagerCase5 = PolymorphismEmployeeCase5).hence both are pointing to the same location.
		polymorphismMamagerCase5.display();
		polymorphismMamagerCase5.getData();
//		polymorphismMamagerCase5.printData() //subclass member can't be access by superclass.

		System.out.println("****************Case 6 : ****************");
		PolymorphismMamager polymorphismMamagerCase6 = new PolymorphismMamager(); // can't be used for this case
		PolymorphismEmployee ePolymorphismEmployeeCase62 = new PolymorphismEmployee(); // can't be used for this case
																						// PolymorphismEmployeeCase6 =
																						// PolymorphismMamagerCase6;
																						// this case is not possible,
																						// compilation error, can not
																						// assign parent to child class
		System.out.println("not valid case");
	}
}