public class q9 {
    /**
     * 对一个int数组快速排序，结果是升序的，并且不会开辟额外的数组空间
     *
     * @param arr 待排序的数组
     * @return 升序排列好的 arr，如果 arr == null，则返回 null
     */
    public static int[] qsort(int[] arr) {
        if (arr == null) {
            return arr;
        } else if (arr.length == 0) {
            return null;
        } else {
            quickSort(arr, 0, arr.length - 1);
            return arr;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int l = left, r = right;
        while (l < r) {
            while (l < r && arr[r] >= arr[left]) {
                r--;
            }
            while (l < r && arr[l] <= arr[left]) {
                l++;
            }
            swap(arr, l, r);
        }
        swap(arr, left, l);
        return l;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
}
