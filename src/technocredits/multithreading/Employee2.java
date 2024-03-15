package technocredits.multithreading;

public class Employee2 extends Thread{

	public void run() {
		m2();
	}
	
	void m2() {
		for(int num=1;num<=100;num++) {
			System.out.println(getName() + ":" + num);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
