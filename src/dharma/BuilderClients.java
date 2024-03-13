package dharma;

public class BuilderClients extends Builder {

	public static void main(String[] args) {
		
		Builder bui1 = BuilderClients.getobject();
		Builder bui2 = BuilderClients.getobject();
		Builder bui3 = BuilderClients.getobject();
		Builder bui4 = BuilderClients.getobject();
		Builder bui5 = BuilderClients.getobject();
		
		System.out.println(bui1);
		System.out.println(bui2);
		System.out.println(bui3);
		System.out.println(bui4);
		System.out.println(bui5);
	}
}
