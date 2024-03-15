package technocredits.interview;

public class Connection {
	private static Connection con; // null
	
	private Connection() {
		
	}
	
	static Connection getObject() {
		if(con == null)
			con = new Connection();
		return con;
	}
	
	void selectQ() {
		
	}
	
	void updateQ() {
	
	}
}
