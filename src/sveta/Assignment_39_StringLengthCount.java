package sveta;

public class Assignment_39_StringLengthCount {

	public static void lengthCount(String[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			char ch=arr[i].charAt(0);
			char ch1=arr[i].toUpperCase().charAt(0);
			if(arr[i].length()>5 && ch==ch1 ) 
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		String[] strArray= {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		lengthCount(strArray);
	}

}
