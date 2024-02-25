package shravani_rapelli;

class Manager{
	int id = 20;
	String mngname = "Shravani";
	int a = 10;
	
	void getMngData() {
		System.out.println("Manager id" + id);
		System.out.println("Value of a" + a);
	}
	
	void display() {
		System.out.println("Manager Name" + mngname);
	}
}

class Employee1 extends Manager{
	int id = 30;
	String empname = "Nitya";
	String empcity = "Banglore";
	
	void getEmpDetails() {
		System.out.println("Employee id" + id);
		System.out.println("Employee name" + empname);
	}
	
	void display() {
		System.out.println("Employee city" + empcity);
	}
}


	public class Assignment68 {
		
		void case1() {
			Manager mng = new Manager();
			System.out.println(mng.id);
			System.out.println(mng.a);
			System.out.println(mng.mngname);
			//System.out.println(mng.empcity); empcity variable is not exist in manager class as we created object with manager reference.
			mng.getMngData();
			mng.display();
			//mng.getEmpDetails(); we can not call this method as this method belongs to employee class and we have created obj with manager refrence.
		}
		
		void case2() {
			Employee1 emp = new Employee1();
			System.out.println(emp.id);
			System.out.println(emp.empname);
			System.out.println(emp.mngname);
			System.out.println(emp.a);//it will take all the variables and methods from manager class 
			System.out.println(emp.empcity);
			emp.getEmpDetails();
			emp.display();
			emp.getMngData();//Employee will gets his own details
		}
		
		void case3() {
			Manager mng = new Employee1();
			// This is Dynamnic Polymorphism. Property will run of child class.
			System.out.println(mng.id);
			System.out.println(mng.a);
			System.out.println(mng.mngname);
			mng.getMngData();
			mng.display();
			//mng.getEmpDetails(); we can not call this method as this method belongs to employee class and we have created obj with manager refrence.
		}
		
		void case4() {
			System.out.println("not valid case");
			/*
			 * Employee emp = new Manager(); // this case is not possible ,Employee is
			 * subclass. System.out.println(emp.id); System.out.println(emp.mngName);
			 * System.out.println(emp.empname); emp.display(); emp.getEmpDetails();
			 */
		}
		
		void case5() {
			Manager mng = new Employee1();
			Employee1 emp = new Employee1();
			mng = emp;
			// left side to right side so Manager mng = new Employee();
			System.out.println(mng.id); // child class property run
			System.out.println(mng.mngname); // child class property run
			mng.display(); // parent method run
			mng.getMngData(); // parent method run
		}
		
		void case6() {
			Manager mng1 = new Employee1();
			Manager mng2 = new Manager();
			mng1 = mng2;
			// left side to right side so Manager mng2 = new Manager();;
			System.out.println(mng1.id);
			System.out.println(mng1.mngname);
			mng1.display();
			mng1.getMngData();
		}
		
		public static void main(String[] args) {
			Assignment68 assgn68 = new Assignment68();
			assgn68.case1();
			assgn68.case2();
			assgn68.case3();
			assgn68.case4();
			assgn68.case5();
			assgn68.case6();
		}
	}

