package madhura_kulkarni;

public class ConnectionClassAssignment73 {
	private static ConnectionClassAssignment73 con = null;

	public static ConnectionClassAssignment73 getObject() {
		if (con == null)
			con = new ConnectionClassAssignment73();
		return con;
	}
}
