import java.util.Arrays;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        Integer[] numbers = {5, 1, 9, 3, 7, 2, 4, 6, 8, 10};

        // Ascending order
        Arrays.sort(numbers);
        System.out.println("Array in Ascending Order: " + Arrays.toString(numbers));

        // Descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array in Descending Order: " + Arrays.toString(numbers));
    }
}
