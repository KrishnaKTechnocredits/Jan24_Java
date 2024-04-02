package nikita_patil;

public class Assignment77 {
	void GetFirstMissingNo(int arr[]) {
		int temp=0;
		boolean flag;
		for(int i=1;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				temp=i;
				break;
			}
		}
		System.out.println("First Missing No is ->" +temp);
	}
	
	void GetMissingLastNo(int arr[]) {
		int temp=0;
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				temp=i;
				
			}
		}
		System.out.println("Last missing No is ->"+temp);
	}
	
	void GetMissingAllNo(int arr[]) {
		System.out.print("All missing No :");
		boolean flag;
		for(int i=1;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.print(i+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment77 a= new Assignment77();
		int[] input = {2,4,1,5,6,9,8,10};
		a.GetFirstMissingNo(input);
		System.out.println();
		a.GetMissingLastNo(input);
		System.out.println();
		a.GetMissingAllNo(input);
	}

}
		
	
