package edu.miu.lab3.problem2;

import java.util.Arrays;

public class Problem2 {
    public static int temp;

    public static void main(String[] args) {
        //Before Reverse: [1, 3, 5, 7, 9, 13]
        int[] arr = {1, 3, 5, 7, 9, 13};
        reverse(0, arr.length - 1, arr);
        //After reverse: [13, 9, 7, 5, 3, 1]
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int left, int right, int[] arr) {
            if(left >= right) {
                return;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverse(left+1, right-1, arr);
    }
}
