package algorithm.sort;

import java.util.Arrays;

/**
 * @author yanjing
 * @desc
 */
public class BubbleSort {

    /**
     * 普通冒泡排序
     * @param arr
     */
    public static void bubbleSort1(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) { // 冒泡趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 设置一个标志，若这趟发生了交换则标志置为true，否则置为false。
     * 若这趟没有发生交换，说明已经完成了排序，此时标志位为false，终止排序
     * @param arr
     */
    public static void bubbleSort2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int i = arr.length - 1; // 冒泡趟数
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            i --;
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 若有100个数的数组，仅前面10个无序，后面90个都已排好序且都大于前面10个数字，
     * 则在第一趟遍历后，最后发生交换的位置必定小于10，且这个位置之后的数据必定已经有序了。
     * 记录下这个位置，第二次只要从数组头部遍历到这个位置就可以了
     * @param arr
     */
    public static void bubbleSort3(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int flag = arr.length;
        int k;
        while (flag > 0) {
            k = flag;
            flag = 0;
            for (int j = 0; j < k - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = j + 1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort3(arr);
    }
}
