package madhura_kulkarni.oops_concepts_programs;

public class Employee extends Manager{
	int empId = 123;
	String empName = "Kirti";

	void printId() {
		System.out.println("Employee Id is " + empId);
	} 
	
	void printName() {
		System.out.println("Employee Name is " + empName);

	}
}
