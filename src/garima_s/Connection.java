package garima_s;

public class Connection {
	private static Connection con;

	private Connection() {

	}

	public static Connection getObject() {
		if (con == null)
			con = new Connection();
		return con;
	}
}
