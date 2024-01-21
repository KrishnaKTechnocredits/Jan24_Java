package nikita_patil;
class Temperature 
{
      void display(int tempIndex) {
		    if(tempIndex < -10) {
			System.out.println("It is Extreme Cold");
		}  else if(tempIndex <= 0 && tempIndex >= -10) {
			System.out.println("It is Very Cold");
		}  else if(tempIndex <= 10 && tempIndex >= 1){
			System.out.println("It is Cold");
		} else if(tempIndex <= 20 && tempIndex >= 11) {
			System.out.println("It is Moderate");
		} else if(tempIndex <= 30 && tempIndex >= 21) {
			System.out.println("It is Warm");
		} else {
			System.out.println("It is Hot");
		}
	}

	public static void main(String[] args) {
		 Temperature t = new Temperature();
		 t.display(-12);
		 t.display(8);
		 t.display(15);
		 t.display(27);
		 t.display(40);
	}
}
