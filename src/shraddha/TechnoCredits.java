package shraddha;


class TechnoCredits
{
	void tech(String input){
		for(int index=input.length();index>0;index--){
			System.out.println(input.charAt(index-1));
		}
	}
	public static void main(String[] args){
		TechnoCredits technoCredits = new TechnoCredits();
		technoCredits.tech("TechnoCredits");
	}
}