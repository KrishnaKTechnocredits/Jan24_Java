package phenol_verma;

import java.util.Arrays;

public class UniqueElements {
    public static int[] getUniqueElements(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[count++] = arr[i];
            }
        }
        
        // Create a new array with correct size
        int[] result = new int[count];
        System.arraycopy(uniqueArray, 0, result, 0, count);
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 25, 10, 127, 10, 20, 25};
        int[] uniqueElements = getUniqueElements(arr);
        
        System.out.println("Unique elements:");
        System.out.println(Arrays.toString(uniqueElements));
    }
}
