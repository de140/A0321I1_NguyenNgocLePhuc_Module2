package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;

        int size;

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.err.print("The size is a integer number <= 20!\n");
                System.out.println();
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}