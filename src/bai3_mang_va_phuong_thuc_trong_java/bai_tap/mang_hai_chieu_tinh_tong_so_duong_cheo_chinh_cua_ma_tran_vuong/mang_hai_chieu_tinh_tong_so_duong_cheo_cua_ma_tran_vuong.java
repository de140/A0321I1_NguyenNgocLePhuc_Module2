package bai3_mang_va_phuong_thuc_trong_java.bai_tap.mang_hai_chieu_tinh_tong_so_duong_cheo_chinh_cua_ma_tran_vuong;
import java.util.Scanner;
public class mang_hai_chieu_tinh_tong_so_duong_cheo_cua_ma_tran_vuong {
    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);

    System.out.print("Enter matrix (row x column): ");
    int row = scanner.nextInt();
    while (row > 20 || row <= 0) {
        if (row > 20) {
            System.err.print("The matrix (row x column) must be less than 21!\n Enter again: ");
            row = scanner.nextInt();
        }
        if (row <= 0) {
            System.err.print("The matrix (row x column) must be greater than 0!\n Enter again: ");
            row = scanner.nextInt();
        }
    }
    int col = row;
    int[][] array2D = new int[row][col];

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print("array[" + i + "][" + j + "] = ");
            array2D[i][j] = scanner.nextInt();
        }
    }
    int sumL = 0;
    int sumR = 0;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print(array2D[i][j] + "\t");
            if (i == j) {
                sumL += array2D[i][j];
            }
            if ((i + j) == (row - 1)) {
                sumR += array2D[i][j];
            }
        }
        System.out.println();
    }

    System.out.println("\nSum of diagonals is: " + sumL + " + " + sumR + " = " + (sumL + sumR));
}
}
