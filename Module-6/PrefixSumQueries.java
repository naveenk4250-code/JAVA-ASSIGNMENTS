public class PrefixSumQueries {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int[] prefixSum = buildPrefixSum(arr);
        
        System.out.println("Array: 2 4 6 8 10 12");
        System.out.println("Sum from index 1 to 3: " + rangeSum(prefixSum, 1, 3));
        System.out.println("Sum from index 2 to 5: " + rangeSum(prefixSum, 2, 5));
        System.out.println("Sum from index 0 to 4: " + rangeSum(prefixSum, 0, 4));
    }
    
    static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    
    static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) return prefix[r];
        return prefix[r] - prefix[l-1];
    }
}
