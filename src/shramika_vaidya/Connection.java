package shramika_vaidya;

public class Connection {

	private static Connection connection;

	private Connection() {

	}

	public static Connection getObject() {
		if (connection == null)
			connection = new Connection();
		return connection;
	}
}
