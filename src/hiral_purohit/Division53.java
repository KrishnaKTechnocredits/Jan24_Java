package hiral_purohit;

public class Division53 {
		
		void processData (int startRange, int endRange) {
			for (int index =startRange ; index <=endRange ; index++) {
				if( index % 3 == 0 && index % 5 == 0 )
					System.out.println(index);
			}
		}
		
		public static void main (String[] args) {
			Division53 division53 = new Division53();
			division53.processData(5, 40);
		}
}