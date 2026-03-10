public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int n = 8;
        
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number from 1 to " + n + ": " + missing);
    }
    
    static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
}
