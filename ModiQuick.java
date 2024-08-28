import java.util.Scanner;

class QuickSort {

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);
        }
    }

    int partition(int arr[], int low, int high) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pivot index (between " + low + " and " + high + "):");
        int p = sc.nextInt();
        
        if (p < low || p > high) {
            System.out.println("Invalid pivot index. Defaulting to last element.");
            p = high;
        }

        int pivot = arr[p];

        // Swap pivot with the first element
        swap(arr, p, low);
        p = low;
        
        int i = low + 1;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Swap pivot to its correct position
        swap(arr, p, i - 1);

        return i - 1; // Return the pivot index
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class ModiQuick {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort ob3 = new QuickSort();
        ob3.quicksort(arr, 0, arr.length - 1);
        System.out.print("Quick Sorted Array: ");
        ob3.printArray(arr);
    }
}
