package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_nho_nhat_trong_mang_su_dungn_phuong_thuc;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang_su_dungn_phuong_thuc {
    private static int size;
    private static int[] array;

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20 || size <= 0) {
                System.err.println("The size <= 20 and size > 0!\n");
                System.out.println();
            }
        } while (size > 20 || size <= 0);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
    }

    public int minValue() {
        inputArray();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        tim_gia_tri_nho_nhat_trong_mang_su_dungn_phuong_thuc min
                = new tim_gia_tri_nho_nhat_trong_mang_su_dungn_phuong_thuc();

        System.out.print("Min value is: " + min.minValue());
    }
}