package src.BasicAlgorithms.SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 28, 1, 8, 9, 20, 80};
        int element = 20;
        int index = applyLinearSearch(array, element);
        System.out.println(index != -1 ? element + " found at index " + index : "Element not found");
    }

    public static int applyLinearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
