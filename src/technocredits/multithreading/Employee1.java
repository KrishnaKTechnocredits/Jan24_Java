package technocredits.multithreading;

public class Employee1 extends Thread{
	
	public void run() {
		m1();
	}
	
	void m1() {
		for(int num=1;num<=100;num++) {
			System.out.println(getName() + ":" + num);
			try {
				Thread.sleep(100);
				System.out.println("******" + getState());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
