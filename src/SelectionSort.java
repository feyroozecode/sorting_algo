public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            int minimum = arr[index];
            arr[index] = arr[i];
            arr[i] = minimum;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
        selectionSort(arr1);// sorting array using selection sort
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


// notes
// Selection sort is an in-place comparison sorting algorithm.

// Determine the function R(n) which express the running time selection sort on an array of size n.
// R(n) = 1 + 2 + 3 + 4 + ... + n-1 + n
// R(n) = n(n+1)/2
// R(n) = O(n2)

// Determine the best algorithm between the bubble sort and selection sort,
// consider all possible scenarios (best case, average case, and worst case) the
// big notation of the running time of the two algorithms.

// Bubble sort: BEST CASE: O(n) AVERAGE CASE: O(n2) WORST CASE: O(n2)
// Selection sort: BEST CASE: O(n2) AVERAGE CASE: O(n2) WORST CASE: O(n2)

// Time Complexity of Bubble Sort: O(n2)
// Time Complexity of Selection Sort: O(n2)

// The best algorithm between the bubble sort and selection sort is the bubble sort.
// The reason is that the bubble sort has a best case of O(n) while the selection sort has a best case of O(n2).
// Given a large array, the bubble sort will be faster than the selection sort.