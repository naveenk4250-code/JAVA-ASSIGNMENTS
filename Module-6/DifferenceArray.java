public class DifferenceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original array:");
        printArray(arr);
        
        DifferenceArray diff = new DifferenceArray(arr);
        
        diff.update(2, 5, 10);
        diff.update(0, 3, 5);
        
        int[] result = diff.applyUpdates();
        System.out.println("Array after updates:");
        printArray(result);
    }
    
    int[] diff;
    int[] original;
    
    DifferenceArray(int[] arr) {
        original = arr.clone();
        diff = new int[arr.length + 1];
    }
    
    void update(int l, int r, int value) {
        diff[l] += value;
        if (r + 1 < diff.length) {
            diff[r + 1] -= value;
        }
    }
    
    int[] applyUpdates() {
        int[] result = new int[original.length];
        int currSum = 0;
        
        for (int i = 0; i < original.length; i++) {
            currSum += diff[i];
            result[i] = original[i] + currSum;
        }
        
        return result;
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
