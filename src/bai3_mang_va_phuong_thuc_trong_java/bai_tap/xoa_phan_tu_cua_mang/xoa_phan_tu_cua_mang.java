package bai3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_cua_mang;

import java.util.Scanner;
import java.util.Arrays;

public class xoa_phan_tu_cua_mang {
    public static int[] delete(int value, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) index = i;
        }
        int[] newArray = new int[array.length - 1];
        if (index != -1) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            System.out.println("Deleted " + value);
            return newArray;
        }
        System.out.println("Not found " + value);
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr = delete(5, arr);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}

