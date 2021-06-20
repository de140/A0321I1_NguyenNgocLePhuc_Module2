package bai1_introduce_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    final static String[] ONES = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", "TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", "NINETEEN"};
    final static String[] TENS = {" ", " ", " TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

    public static void readNumber(int num, String value) {
        System.out.println(num > 19 ? TENS[num / 10] + " " + ONES[num % 10] : ONES[num]);
        System.out.println(num > 0 ? value : "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        readNumber(((num / 100) % 10), value: "HUNDRED ");
        readNumber((num: num % 100), value:"");
    }
}
