package bai1_introduce_to_java.thuc_hanh.tinh_chi_so_can_nang_cua_co_the;
import  java.util.Scanner;
public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight: ");
        float weight = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.printf("Body mass index is: %-7.2f%s ", bmi, "- Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.printf("Body mass index is: %-7.2f%s ", bmi, "- Status: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.printf("Body mass index is: %-7.2f%s ", bmi, "- Status: Overweight");
        } else {
            System.out.printf("Body mass index is: %-7.2f%s ", bmi, "- Status: Obese");
        }
    }
}
