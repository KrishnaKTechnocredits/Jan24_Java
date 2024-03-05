package rohini_deshmane.oops_concept_related_Programs;

public class SingletonDesignPatternLazyLoading {
	private static SingletonDesignPatternLazyLoading con = null;
	
	private SingletonDesignPatternLazyLoading(){
		System.out.println("Lazy loading Singleton Construtor");
	}

	static SingletonDesignPatternLazyLoading getObject() {
		if(con ==null) {
			con = new SingletonDesignPatternLazyLoading();
			System.out.println("Singleton Object created !!");
		}
		return con;
	}
	
	public static void main(String[] args) {
		SingletonDesignPatternLazyLoading.getObject();
	}
}
