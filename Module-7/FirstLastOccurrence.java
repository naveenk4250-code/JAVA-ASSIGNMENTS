public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 7};
        int target = 3;
        
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        
        if (first != -1) {
            System.out.println("First occurrence of " + target + ": index " + first);
            System.out.println("Last occurrence of " + target + ": index " + last);
            System.out.println("Total count: " + (last - first + 1));
        } else {
            System.out.println("Element not found");
        }
    }
    
    static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
