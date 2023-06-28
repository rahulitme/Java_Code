
public class merge_sort {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int mergeSize = ei - si + 1;
        int merged[] = new int[mergeSize];
        int index1 = si;
        int index2 = mid + 1;
        int i = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[i++] = arr[index1++];
            } else {
                merged[i++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[i++] = arr[index1++];
        }

        while (index2 <= ei) {
            merged[i++] = arr[index2++];
        }

        for (int j = 0; j < merged.length; j++) {
            arr[si + j] = merged[j];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 6, 74, 2 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
