package sasmita;

public class Clients {

	public static void main(String[] args) {
		Connections con1 = Connections.getobject();
		Connections con2 = Connections.getobject();
		Connections con3 = Connections.getobject();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);

	}

}
