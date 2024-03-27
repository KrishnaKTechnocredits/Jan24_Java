package phenol_verma;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Convert ArrayList to array
        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);
       


        // Print the array
            System.out.println(Arrays.toString(array));
            
        }
    }

