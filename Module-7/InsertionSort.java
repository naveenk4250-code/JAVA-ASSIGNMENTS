public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted array (Insertion Sort):");
        printArray(arr);
        
        System.out.println("\nAdvantage for nearly sorted arrays:");
        int[] nearlySorted = {1, 2, 3, 5, 4, 6, 7, 8, 9};
        System.out.print("Nearly sorted array: ");
        printArray(nearlySorted);
        insertionSort(nearlySorted);
        System.out.print("After insertion sort: ");
        printArray(nearlySorted);
        System.out.println("Insertion sort performs in O(n) for nearly sorted arrays!");
    }
    
    static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
