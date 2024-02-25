package technocredits.p1;

public class FinalExample{
	
	final int x = 10;
	final static int y = 10;
	
	void m1() {
		int ans = y + 10;
		ans = ans + 1;
		ans++;
		
		final int total = ans;
		System.out.println(total);
		
	}
	
}
