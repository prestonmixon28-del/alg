import java.util.Random;

public class Sorts {

    // Generate an array with random numbers
    public static int[] initValues(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }

        return array;
    }

    // Check if the array is sorted
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    // Swap two elements
    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // Print the array
    public static void printValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
