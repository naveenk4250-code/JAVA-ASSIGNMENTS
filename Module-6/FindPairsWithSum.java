import java.util.HashSet;

public class FindPairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 8, 3, 5, 7};
        int target = 10;
        
        findPairs(arr, target);
    }
    
    static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        
        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                found = true;
            }
            set.add(num);
        }
        
        if (!found) {
            System.out.println("No pairs found");
        }
    }
}
