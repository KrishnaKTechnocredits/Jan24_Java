package shafaque;

public class Assignment77 {
	
            void getFirstMissingNum(int[] arr) {
			for (int i = 1; i <= 10; i++) {
				boolean flag = false;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == i) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("First Missing Number : " + i);
					break;
				}
			}
		}

		void getLastMissingNum(int[] arr) {
			for (int i = 10; i >= 1; i--) {
				boolean flag = false;
				for (int j = arr.length - 1; j >= 0; j--) {
					if (arr[j] == i) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("Last Missing Number : " + i);
					break;
				}
			}
		}

		void getAllMissingNum(int[] arr) {
			for (int i = 1; i <= 10; i++) {
				boolean flag = false;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == i) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.print(i + " ");
				}
			}
		}

		public static void main(String[] args) {
			int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
			Assignment77 assignment77 = new Assignment77();
			assignment77.getFirstMissingNum(x);
			assignment77.getLastMissingNum(x);
			System.out.print("All Missing Numbers : ");
			assignment77.getAllMissingNum(x);

		}
	}


