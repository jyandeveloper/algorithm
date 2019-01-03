package algorithm.sort;

import java.util.Arrays;

/**
 * @author yanjing
 * @desc
 */
public class InsertSort {

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr) {
        System.out.println(Arrays.toString(arr));

        if (arr.length <= 0) {
            return;
        }
        int current;
        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i + 1];
            int j = i;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertSort(arr);
    }
}

