public class Main {

    public static void main(String[] args) {

        // Create an array with 50 random numbers
        int[] numbers = Sorts.initValues(50);

        System.out.println("Original Array:");

        // Display the array
        Sorts.printValues(numbers);

        // Check if the array is sorted
        System.out.println("Is the array sorted? "
                + Sorts.isSorted(numbers));
    }
}
