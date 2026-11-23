public class Main {

    public static void main(String[] args) {

        int[] numbers = Sorts.initValues(50);

        System.out.println("Original Array:");
        Sorts.printValues(numbers);

       
        Sorts.selectionSort(numbers);

        System.out.println("Sorted Array:");
        Sorts.printValues(numbers);

        // Verify sorting
        System.out.println("Is the array sorted? "
                + Sorts.isSorted(numbers));
    }
}

