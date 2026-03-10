import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 5, -2, 3};
        int k = 5;
        
        int length = longestSubarrayLength(arr, k);
        System.out.println("Longest subarray length with sum " + k + ": " + length);
    }
    
    static int longestSubarrayLength(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum == k) {
                maxLength = i + 1;
            }
            
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxLength;
    }
}
