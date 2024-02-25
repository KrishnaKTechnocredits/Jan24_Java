package varsha.inheritance_cases;

//Write down all 6 cases of Inheritance using Manager and Employee class.
//
//class Manager{
//
//}
//
//class Employee{
//
//}
//
//class Test{
//	void case3(){
//		Manager mng = new Employee();
//		mng.x;
//		mng.y;
//		//sop(mng.z); [mng can access only those variables which are available in Manager class becase Manger is a refere type]
//	} 
//}
public class Manager {
	 
	int x = 10; 
	int y = 20; 
	
	void m1() {
		System.out.println("Hi");
	}
	
	void m2() {
		System.out.println("Hello");
	}
		
}
