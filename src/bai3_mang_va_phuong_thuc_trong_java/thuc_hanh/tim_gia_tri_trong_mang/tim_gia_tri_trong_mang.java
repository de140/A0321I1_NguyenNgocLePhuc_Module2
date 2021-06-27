package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name's student: ");
        String inputName = scanner.nextLine().toLowerCase();
        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (inputName.equals(students[i].toLowerCase())) {
                System.out.println("Position of " + students[i] + " in the list is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found!");
        }
    }
}