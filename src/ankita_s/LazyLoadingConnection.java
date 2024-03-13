package ankita_s;

public class LazyLoadingConnection {

	private static LazyLoadingConnection con = null;

	private LazyLoadingConnection() {

	}

	void updateQuery() {
	}

	static LazyLoadingConnection getobject() {
		if (con == null)
			con = new LazyLoadingConnection();
		return con;
	}

	public static void main(String[] args) {
	}
}
