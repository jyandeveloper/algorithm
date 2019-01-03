package algorithm.sort;

import java.util.Arrays;

/**
 * @author yanjing
 * @desc
 */
public class SelectSort {

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectSort(arr);
    }
}
