package technocredits.multithreading;

public class Manager {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		
		emp1.setName("Anvit");
		emp2.setName("Maulik");
		
		emp1.setPriority(10);
		//System.out.println("******" + emp1.getState());
		
		//System.out.println(emp1.getName()  + ":" + emp1.getPriority());
		//System.out.println(emp2.getName()  + ":" + emp2.getPriority());
		emp1.start();
		emp2.start();
		
		System.out.println("**************MAIN END");
		System.out.println("******" + emp1.getState());
		
	}
}
