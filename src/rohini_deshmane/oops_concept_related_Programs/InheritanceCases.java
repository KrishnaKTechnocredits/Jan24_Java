package rohini_deshmane.oops_concept_related_Programs;
/*
 * Assignment - 68 : 18th Feb'2024
Write down all 6 cases of Inheritance using Manager and Employee class.
 */
class Manager{
	int id=123;
	String name="Mayur";
	
	void printId() {
		System.out.println("Manager Id = "+id);
	}
	
	void printName() {
		System.out.println("Manager Name = "+name);
	}
}

class Employee extends Manager{
	String name="Taniya";
	int rating=4;
	
	
	void printName() {
		System.out.println("Employee Name = "+name);
	}
	
	void printStatement() {
		System.out.println("Called Employee print Method");
	}
}

public class InheritanceCases {
	
	 public static void main(String[] args) {
		 
		 //Create parent class variable and access all methods, With this object variables and methods only available in parent class
		 Manager case1 = new Manager();
		 System.out.println(case1.id);
		 System.out.println(case1.name);
		// System.out.println(case1.rating); //CE
		 case1.printId();
		 case1.printName();
		// case1.printStatement(); //CE
		 
		 System.out.println("\n");
		 //Create child class object varialbe and access all methods, 
		 //With this object variables and methods only available in child class
		 //if not availble in child then access varialble from parent class.
		 Employee case2 = new Employee();
		 System.out.println(case2.id);
		 System.out.println(case2.name);
		 System.out.println(case2.rating); 
		 case2.printId();
		 case2.printName();
		 case2.printStatement(); 
		
		 System.out.println("\n");
		 //Create Parent class varialbe and access all methods, 
		 //With this object variable value will be same as parents variable value
		 //methods behaviour will not be changes it will same as child methods behaviour
		 Manager case3 = new Employee();
		 System.out.println(case3.id);
		 System.out.println(case3.name);
		// System.out.println(case3.rating); //CE
		 case3.printId();
		 case3.printName();
		// case3.printStatement(); //CE
		 
		/* Compilation Error : parent to child assignment is not possible. 
		 * 
		 Employee case4 = new Manager();
		 System.out.println(case4.id);
		 System.out.println(case4.name);
		 System.out.println(case4.rating); 
		 case4.printId();
		 case4.printName();
		 case4.printStatement(); */
		 
		 System.out.println("\n");
		 /* With this object case5 behaviour is same like case three
		  * 
		  */
		 Manager case5 = new Employee();
		 Employee caseTwo  = new Employee();
		 case5 = caseTwo;
		 System.out.println(case5.id);
		 System.out.println(case5.name);
		// System.out.println(case5.rating); //CE
		 case5.printId();
		 case5.printName();
		 //case5.printStatement(); //CE
		 
		 
		 /* Compilation Error : parent to child assignment is not possible. 
		  
		 Manager caseThree = new Employee();
		 Employee case6  = new Employee();
		 case6 = caseThree;
		 
		 System.out.println(case5.id);
		 System.out.println(case5.name);
		// System.out.println(case5.rating); //CE
		 case5.printId();
		 case5.printName();
		 //case5.printStatement(); //CE */
	}
}
