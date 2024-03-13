package sveta;

public class Connection {
	private static Connection con;
	private Connection() {
		
	}
	 static Connection getObject() {
		if(con == null) 
			con = new Connection();
			return con;
	}
}
