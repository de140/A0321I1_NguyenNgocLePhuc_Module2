package bai1_introduce_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một số có nhiều nhất 3 chữ số: ");
        int n = input.nextInt();
        int tr = n / 100;
        int ch = (n % 100) / 10;
        int dv = ((n % 100) % 10);

        if ((tr == 1) && (ch == 0) && (dv == 0))
            System.out.print("ONE HUNDRED ");
        else if ((tr == 2) && (ch == 0) && (dv == 0))
            System.out.print("TWO HUNDRED ");
        else if ((tr == 3) && (ch == 0) && (dv == 0))
            System.out.print("THREE HUNDRED ");
        else if ((tr == 4) && (ch == 0) && (dv == 0))
            System.out.print("FOUR HUNDRED ");
        else if ((tr == 5) && (ch == 0) && (dv == 0))
            System.out.print("FIVE HUNDRED ");
        else if ((tr == 6) && (ch == 0) && (dv == 0))
            System.out.print("SIX HUNDRED ");
        else if ((tr == 7) && (ch == 0) && (dv == 0))
            System.out.print("SEVEN HUNDRED ");
        else if ((tr == 8) && (ch == 0) && (dv == 0))
            System.out.print("EIGHT HUNDRED ");
        else if ((tr == 9) && (ch == 0) && (dv == 0))
            System.out.print("NINE HUNDRED ");

        else if ((tr == 0) && (ch == 1) && (dv == 0))
            System.out.print(" TEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 1))
            System.out.print(" ELEVEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 2))
            System.out.print(" TWELVE ");
        else if ((tr == 0) && (ch == 1) && (dv == 3))
            System.out.print(" THIRTEEN");
        else if ((tr == 0) && (ch == 1) && (dv == 4))
            System.out.print(" FOURTEEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 5))
            System.out.print(" FIFTEEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 6))
            System.out.print(" SIXTEEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 7))
            System.out.print(" SEVENTEEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 8))
            System.out.print(" EIGHTEEN ");
        else if ((tr == 0) && (ch == 1) && (dv == 9))
            System.out.print(" NINETEEN ");
        else if ((tr == 0) && (ch == 2) && (dv == 0))
            System.out.print("TWENTY ");
        else if ((tr == 0) && (ch == 3) && (dv == 0))
            System.out.print("THIRTY ");
        else if ((tr == 0) && (ch == 4) && (dv == 0))
            System.out.print("FORTY ");
        else if ((tr == 0) && (ch == 5) && (dv == 0))
            System.out.print("FIFTY ");
        else if ((tr == 0) && (ch == 6) && (dv == 0))
            System.out.print("SIXTY ");
        else if ((tr == 0) && (ch == 7) && (dv == 0))
            System.out.print("SEVENTY ");
        else if ((tr == 0) && (ch == 8) && (dv == 0))
            System.out.print("EIGHTY ");
        else if ((tr == 0) && (ch == 9) && (dv == 0))
            System.out.print("NINETY ");

        else if ((tr == 0) && (ch == 0) && (dv == 0))
            System.out.print(" ZERO ");
        else if ((tr == 0) && (ch == 0) && (dv == 1))
            System.out.print(" ONE ");
        else if ((tr == 0) && (ch == 0) && (dv == 2))
            System.out.print("TWO ");
        else if ((tr == 0) && (ch == 0) && (dv == 3))
            System.out.print("THREE ");
        else if ((tr == 0) && (ch == 0) && (dv == 4))
            System.out.print("FOUR ");
        else if ((tr == 0) && (ch == 0) && (dv == 5))
            System.out.print("FIVE ");
        else if ((tr == 0) && (ch == 0) && (dv == 6))
            System.out.print("SIX ");
        else if ((tr == 0) && (ch == 0) && (dv == 7))
            System.out.print("SEVEN ");
        else if ((tr == 0) && (ch == 0) && (dv == 8))
            System.out.print("EIGHT ");
        else if ((tr == 0) && (ch == 0) && (dv == 9))
            System.out.print("NINE ");

        else {
            switch (tr) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("ONE HUNDRED ");
                    break;
                case 2:
                    System.out.print("TWO HUNDRED ");
                    break;
                case 3:
                    System.out.print("THREE HUNDRED ");
                    break;
                case 4:
                    System.out.print("FOUR HUNDRED ");
                    break;
                case 5:
                    System.out.print("FIVE HUNDRED ");
                    break;
                case 6:
                    System.out.print("SIX HUNDRED ");
                    break;
                case 7:
                    System.out.print("SEVEN HUNDRED ");
                    break;
                case 8:
                    System.out.print("EIGHT HUNDRED ");
                    break;
                case 9:
                    System.out.print("NINE HUNDRED ");
                    break;
            }
            switch (ch) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("TEN ");
                    break;
                case 2:
                    System.out.print("TWENTY ");
                    break;
                case 3:
                    System.out.print("THIRTY ");
                    break;
                case 4:
                    System.out.print("FORTY ");
                    break;
                case 5:
                    System.out.print("FIFTY ");
                    break;
                case 6:
                    System.out.print("SIXTY ");
                    break;
                case 7:
                    System.out.print("SEVENTY ");
                    break;
                case 8:
                    System.out.print("EIGHTY ");
                    break;
                case 9:
                    System.out.print("NINETY ");
                    break;
            }
            switch (dv) {

                case 1:
                    System.out.print("ONE ");
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVEN ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE");
                    break;
            }
        }

    }

}
