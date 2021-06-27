package bai3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Arrays;

public class gop_mang {
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        int x = 0;
        for (int i = array1.length; i < newArray.length; i++) {
            newArray[i] = array2[x];
            x++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15, 16, 17};
        int[] newArray = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(newArray));
    }
}

