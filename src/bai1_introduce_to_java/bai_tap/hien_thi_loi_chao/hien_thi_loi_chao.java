package bai1_introduce_to_java.bai_tap.hien_thi_loi_chao;
import  java.util.Scanner;
public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Hello! " + name);
    }
}
