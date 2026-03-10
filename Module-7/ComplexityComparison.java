public class ComplexityComparison {
    public static void main(String[] args) {
        System.out.println("=== TIME & SPACE COMPLEXITY COMPARISON ===\n");
        
        System.out.println("┌───────────────┬──────────────┬───────────────┬───────────────┬────────────────┬───────────────┐");
        System.out.println("│   Algorithm   │  Best Case   │  Average Case │   Worst Case  │  Space Complexity │    Stable?    │");
        System.out.println("├───────────────┼──────────────┼───────────────┼───────────────┼────────────────┬───────────────┤");
        System.out.println("│ Bubble Sort   │    O(n)      │    O(n²)      │    O(n²)      │      O(1)      │     Yes       │");
        System.out.println("├───────────────┼──────────────┼───────────────┼───────────────┼────────────────┼───────────────┤");
        System.out.println("│ Selection Sort│    O(n²)     │    O(n²)      │    O(n²)      │      O(1)      │     No        │");
        System.out.println("├───────────────┼──────────────┼───────────────┼───────────────┼────────────────┼───────────────┤");
        System.out.println("│ Insertion Sort│    O(n)      │    O(n²)      │    O(n²)      │      O(1)      │     Yes       │");
        System.out.println("├───────────────┼──────────────┼───────────────┼───────────────┼────────────────┼───────────────┤");
        System.out.println("│  Merge Sort   │  O(n log n)  │  O(n log n)   │  O(n log n)   │      O(n)      │     Yes       │");
        System.out.println("├───────────────┼──────────────┼───────────────┼───────────────┼────────────────┼───────────────┤");
        System.out.println("│  Quick Sort   │  O(n log n)  │  O(n log n)   │    O(n²)      │   O(log n)     │     No        │");
        System.out.println("└───────────────┴──────────────┴───────────────┴───────────────┴────────────────┴───────────────┘");
        
        System.out.println("\n=== DETAILED ANALYSIS ===\n");
        
        System.out.println("BUBBLE SORT:");
        System.out.println("- Time: O(n²) average/worst, O(n) best (optimized with swapped flag)");
        System.out.println("- Space: O(1) - in-place sorting");
        System.out.println("- Stable: Yes (equal elements maintain relative order)");
        System.out.println("- Best for: Educational purposes, small datasets\n");
        
        System.out.println("SELECTION SORT:");
        System.out.println("- Time: O(n²) in all cases (always finds minimum)");
        System.out.println("- Space: O(1) - in-place sorting");
        System.out.println("- Stable: No (swapping can change relative order)");
        System.out.println("- Best for: When memory is limited and dataset is small\n");
        
        System.out.println("INSERTION SORT:");
        System.out.println("- Time: O(n²) average/worst, O(n) best (nearly sorted data)");
        System.out.println("- Space: O(1) - in-place sorting");
        System.out.println("- Stable: Yes (inserts without disturbing equal elements)");
        System.out.println("- Best for: Small datasets or nearly sorted data\n");
        
        System.out.println("MERGE SORT:");
        System.out.println("- Time: O(n log n) in all cases (consistent performance)");
        System.out.println("- Space: O(n) - requires auxiliary array");
        System.out.println("- Stable: Yes (merge step preserves order)");
        System.out.println("- Best for: Large datasets, guaranteed performance, stable sort needed\n");
        
        System.out.println("QUICK SORT:");
        System.out.println("- Time: O(n log n) average, O(n²) worst (poor pivot choice)");
        System.out.println("- Space: O(log n) - recursive stack space");
        System.out.println("- Stable: No (partitioning swaps elements)");
        System.out.println("- Best for: General purpose, in-memory sorting, good average performance");
    }
}
