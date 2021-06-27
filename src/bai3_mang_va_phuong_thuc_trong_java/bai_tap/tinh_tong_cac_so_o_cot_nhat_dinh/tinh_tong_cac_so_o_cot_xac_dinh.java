package bai3_mang_va_phuong_thuc_trong_java.bai_tap.tinh_tong_cac_so_o_cot_nhat_dinh;

import java.util.Scanner;

public class tinh_tong_cac_so_o_cot_xac_dinh {


    public int sum(int[][] array, int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a column to sum (starting from 0): ");
        int iCol = sc.nextInt();
        while (iCol >= col || iCol < 0) {
            if (iCol >= col) {
                System.err.print("The index of column < " + col + " : ");
                iCol = sc.nextInt();
            }
            if (iCol < 0) {
                System.err.print("The index of column >= 0: ");
                iCol = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (iCol == j){
                    sum += array[i][j];
                }
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();
        int[][] array2D = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
        }

        tinh_tong_cac_so_o_cot_xac_dinh s = new tinh_tong_cac_so_o_cot_xac_dinh();
        System.out.print("Sum of column is: " +
                s.sum(array2D, row, col));
    }
}