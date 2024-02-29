package samiksha;

class Manager{
	int id=7;
	String name="Samiksha";
	
	void m1() {
		System.out.println("m1 of parent class:");
		System.out.println("id id " + id);
		System.out.println("name is " + name);
	}
}

class Employee10 extends Manager{
	int id = 10;
	String str = "Gadakh";
	
	void m1() {
		System.out.println("m1 of child class:");
		System.out.println("id is " + id);
		System.out.println("hii");
	}
	
	void display() {
		System.out.println("hello");
	}
}
public class Inheritance {
	
	public static void main(String[] args) {
	System.out.println("====Case 1 ====");
	Manager mng = new Manager();
	System.out.println(mng.id);
	System.out.println(mng.name);
	mng.m1();
	//mng.display();
	
	System.out.println("====Case2====");
	Employee10 emp = new Employee10();
	System.out.println(emp.id);
	System.out.println(emp.str);
	emp.m1();
	emp.display();
	
	System.out.println("====Case3====");
	Manager mng1 = new Employee10();
	System.out.println(mng1.id);
	System.out.println(mng1.name);
	//System.out.println(mng.str);
	mng1.m1();
	//mng.display();
	
	System.out.println("====Case4====");
	//Employee10 emp1 = new Manager();
	System.out.println("compilation error.child class can't hold the object of parent class");
	
	System.out.println("====Case5====");
	Manager mng2 = new Manager();
	Employee10 emp1 = new Employee10();
	mng2=emp1;
	System.out.println(mng2.id);
	System.out.println(mng2.name);
	//System.out.println(mng.str);
	mng2.m1();
	//mng2.display();
	
	System.out.println("====Case6");
	Manager mng3 = new Manager();
	Employee10 emp2 = new Employee10();
	//emp2=mng3;
	System.out.println("CE. as child class can not hold parent class object");
	}

}
