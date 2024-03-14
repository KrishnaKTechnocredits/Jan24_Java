/*Assignment - 68 : 18th Feb'2024
Write down all 6 cases of Inheritance using Manager and Employee class.
3
class Manager{

}

class Employee{

}

class Test{
	void case3(){
		Manager mng = new Employee();
		mng.x;
		mng.y;
		//sop(mng.z); [mng can access only those variables which are available in Manager class becase Manger is a refere type]
	} 
}*/
package sveta;

public class Employee1 extends Manager1 {

	int id =20;
	String empname="abc";
	String location ="India";
	void getData() {
		System.out.println("Employeee id : "+id);
	}
	void display() {
		System.out.println("name is :" +empname);
	}
	public static void main(String[] args) {


	}

}
