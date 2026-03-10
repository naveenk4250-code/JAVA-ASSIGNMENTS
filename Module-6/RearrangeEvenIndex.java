public class RearrangeEvenIndex {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 1, 4, 7, 5};
        
        System.out.println("Original array:");
        printArray(arr);
        
        rearrangeEvenIndex(arr);
        
        System.out.println("Array with even numbers at even indices:");
        printArray(arr);
    }
    
    static void rearrangeEvenIndex(int[] arr) {
        int evenIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[evenIndex];
                arr[evenIndex] = temp;
                evenIndex += 2;
                
                if (evenIndex >= arr.length) break;
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
