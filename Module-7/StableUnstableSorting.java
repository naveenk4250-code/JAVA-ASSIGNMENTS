import java.util.Arrays;

class Employee {
    String name;
    int age;
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class StableUnstableSorting {
    public static void main(String[] args) {
        System.out.println("=== STABLE VS UNSTABLE SORTING ===\n");
        
        Employee[] employees = {
            new Employee("John", 25),
            new Employee("Alice", 25),
            new Employee("Bob", 30),
            new Employee("Zara", 30),
            new Employee("Mike", 25)
        };
        
        System.out.println("Original array (sorted by name):");
        System.out.println(Arrays.toString(employees));
        
        System.out.println("\nSTABLE SORT EXAMPLE - Merge Sort:");
        System.out.println("When sorting by age, relative order of equal-age employees is preserved:");
        Employee[] mergeSorted = employees.clone();
        stableMergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println(Arrays.toString(mergeSorted));
        
        System.out.println("\nUNSTABLE SORT EXAMPLE - Quick Sort:");
        System.out.println("When sorting by age, relative order of equal-age employees may change:");
        Employee[] quickSorted = employees.clone();
        unstableQuickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println(Arrays.toString(quickSorted));
        
        System.out.println("\n--- Stability Summary ---");
        System.out.println("Stable sorts: Bubble Sort, Insertion Sort, Merge Sort");
        System.out.println("Unstable sorts: Selection Sort, Quick Sort, Heap Sort");
    }
    
    static void stableMergeSort(Employee[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            stableMergeSort(arr, left, mid);
            stableMergeSort(arr, mid + 1, right);
            stableMerge(arr, left, mid, right);
        }
    }
    
    static void stableMerge(Employee[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        Employee[] L = new Employee[n1];
        Employee[] R = new Employee[n2];
        
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (L[i].age <= R[j].age) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    
    static void unstableQuickSort(Employee[] arr, int low, int high) {
        if (low < high) {
            int pi = unstablePartition(arr, low, high);
            unstableQuickSort(arr, low, pi - 1);
            unstableQuickSort(arr, pi + 1, high);
        }
    }
    
    static int unstablePartition(Employee[] arr, int low, int high) {
        int pivot = arr[high].age;
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j].age < pivot) {
                i++;
                Employee temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        Employee temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}
