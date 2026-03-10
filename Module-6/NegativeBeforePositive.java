public class NegativeBeforePositive {
    public static void main(String[] args) {
        int[] arr = {4, -3, 2, -1, 5, -7, 8, -6};
        
        System.out.println("Original array:");
        printArray(arr);
        
        rearrange(arr);
        
        System.out.println("Rearranged array (negatives before positives):");
        printArray(arr);
    }
    
    static void rearrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
