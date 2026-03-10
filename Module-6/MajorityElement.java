public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3, 1, 3};
        
        int majority = findMajorityElement(arr);
        
        if (majority != -1) {
            System.out.println("Majority element: " + majority);
        } else {
            System.out.println("No majority element found");
        }
    }
    
    static int findMajorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
