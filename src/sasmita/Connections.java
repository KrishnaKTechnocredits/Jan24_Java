package sasmita;

public class Connections {
	private static Connections con = null;

	private Connections() {
	}

	static Connections getobject() {
		if (con == null)
			con = new Connections();
		return con;
	}
}
