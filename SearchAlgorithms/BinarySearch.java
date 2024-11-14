package SearchAlgorithms;
public class BinarySearch { 
    public static void main(String[] args) { 
        int[] array = {10, 20, 30, 35, 70, 176, 190, 278}; 
        int element = 20; 
        int index = applyBinarySearch(array, element); 
        System.out.println(index != -1 ? element + " found at index " + index : "Element not found"); 
    } 
        
    public static int applyBinarySearch(int[] array, int element) { 
        int low = 0, high = array.length, mid; 
        while(low <=high) { mid = (low + high)/2; 
            if(array[mid] == element) { 
                return mid; 
            } else if (element < array[mid]) { 
                high = mid - 1; 
            } else if (element > array[mid]) { 
                low = mid + 1; } 
            } 
            return -1; 
        } 
    }