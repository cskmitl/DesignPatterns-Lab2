// Interface for Sorting Algorithm
interface SortingAlgorithm {
    void sort();
}

// Selection Sort Implementation
class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Selection sort is sorting the items...");
    }
}

// Merge Sort Implementation
class MergeSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Merge sort is sorting the items...");
    }
}

// Insertion Sort Implementation
class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Insertion sort is sorting the items...");
    }
}

public class SortProgram {
    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SelectionSort(); // ตัวอย่างการเรียกใช้งาน
        sortingAlgorithm.sort();
    }
}
