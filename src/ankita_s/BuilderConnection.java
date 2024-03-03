package ankita_s;

public class EagerLoadingConnection {
	private static EagerLoadingConnection con = new EagerLoadingConnection();

	private EagerLoadingConnection() {
	}

	void updateQuery() {
	}

	static EagerLoadingConnection getobject() {
		return con;
	}

	public static void main(String[] args) {
	}
}
