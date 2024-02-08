package rupali_umagol;

public class Assignment40 {
	void getConsonentNames(String[] names) {
		for(int i=0;i<names.length;i++) {
			String str=names[i].toLowerCase();
			if(!str.startsWith("a") && !str.startsWith("e") && !str.startsWith("i") && !str.startsWith("o") && !str.startsWith("u")) {
				if(str.endsWith("a") || str.endsWith("e") || str.endsWith("i") || str.endsWith("o") || str.endsWith("u") ){
				System.out.println(str);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment40 assignment40=new Assignment40();
		String[] arr={"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"};
		assignment40.getConsonentNames(arr);
	}
}