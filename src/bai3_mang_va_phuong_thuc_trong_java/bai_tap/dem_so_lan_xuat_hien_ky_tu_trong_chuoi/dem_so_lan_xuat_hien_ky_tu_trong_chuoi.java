package bai3_mang_va_phuong_thuc_trong_java.bai_tap.dem_so_lan_xuat_hien_ky_tu_trong_chuoi;

import java.util.Scanner;

public class dem_so_lan_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String newStr = str.toLowerCase();

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == c) {
                count++;
            }
        }
        System.out.print("Number of characters is: " + count);
    }
}
