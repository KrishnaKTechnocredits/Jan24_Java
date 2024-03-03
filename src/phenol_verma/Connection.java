package phenol_verma;

public class Connection {

	private static Connection conn;
	
	private Connection() {
		System.out.println("Lazy Loading Implemantation");
	}
			
	public static Connection getObject() {
		if (conn == null) {
			conn = new Connection();
		}
		return conn;
	}

}
