public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);// sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}

// notes
// Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

// Determine the function T(n) which is the running time of bubble sort on an array of size n.
// T(n) = 1 + 2 + 3 + 4 + ... + n-1 + n
// T(n) = n(n+1)/2
// T(n) = O(n2)

// Determine the best, average and the worst case scenario of bubble sort
// based on its running time function.
// Best case: O(n)
// Average case: O(n2)
// Worst case: O(n2)

// Time Complexity: O(n2)
// Bubble sort has a time complexity of O(n2) as there are nested loops.
