import java.util.*;

class Sorting {
    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // BubbleSort with time complexity O(n^2)
    public void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Bubble Sorted Array: ");
        printArray(arr);
    }

    // SelectionSort with time complexity O(n^2)
    public void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Selection Sorted Array: ");
        printArray(arr);
    }

    // InsertionSort with time complexity O(n^2)
    public void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.print("Insertion Sorted Array: ");
        printArray(arr);
    }
}

class MergeSort {
    void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Array to hold the merged result
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merge the two halves into merged[]
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the left half (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the right half (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}

class QuickSort
{
 void quicksort(int arr[], int low, int high)
{ if(low<high)
{
int pidx= partition(arr,low,high);
quicksort(arr, low, pidx-1);
quicksort(arr, pidx+1, high);

}
}
int partition(int arr[], int low, int high)
{
int i,j;
int pivot= arr[high];
 i=low-1;
for(j=0;j<high;j++)
{
if(arr[j]<pivot)
{
i++;
//swap
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
i++;
int temp=arr[i];
arr[i]=pivot;
arr[high]=temp;
return i;//pivot index
}
}
class MainSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Sorting ob1 = new Sorting(); // Creating an object of the Sorting class

        ob1.BubbleSort(arr);  // Using the object to call the method, modifying the original array
        ob1.SelectionSort(arr);
        ob1.InsertionSort(arr);

        MergeSort ob2 = new MergeSort(); // Creating an object of the MergeSort class
        ob2.divide(arr, 0, arr.length - 1); // Calling divide with the array, start index, and end index

        System.out.print("Merge Sorted Array: ");
        ob1.printArray(arr); // Print the final sorted array after MergeSort
QuickSort ob3 = new QuickSort();
 ob3.quicksort(arr, 0, arr.length-1);
 System.out.print("Quick Sorted Array: ");
        ob1.printArray(arr);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
