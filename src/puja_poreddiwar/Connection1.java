package puja_poreddiwar;

public class Connection1 {
	
	public static Connection1 con = new Connection1();
	
	private Connection1() {
		
	}
	
	static Connection1 getObject() {
		return con;
		
	}
	

}
