package hiral_purohit;

public class ReturnEx {

	void getTargetChar(String name ,char ch){
		int count =0;
		for (int i =0; i < name.length(); i++){
			String lower = name.toLowerCase();
			if (lower.charAt(i) == ch){
			count++;
			}
		}
		System.out.println(" frequency of " + ch + " in technocredits is  " + count);	
		}
	
	public static void main(String[] args){
		ReturnEx returnEx = new ReturnEx();
		returnEx.getTargetChar ("technocrediTs teaches Technology", 't');
	}
 }
