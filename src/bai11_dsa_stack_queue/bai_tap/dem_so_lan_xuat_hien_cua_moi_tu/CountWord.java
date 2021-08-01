package bai11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = scanner.nextLine();
        input = input.trim().toLowerCase();
        String[] stringArrray = input.split("\\s+");
        Map<String, Integer> countWord = new HashMap<String, Integer>();

        for (String string : stringArrray) {
            if (countWord.containsKey(string)) {
                Integer newValue = countWord.get(string) + 1;
                countWord.put(string, newValue);
            } else {
                countWord.put(string, 1);
            }
        }

        for (String key : countWord.keySet()) {
            System.out.println(key + " : " + countWord.get(key));
        }

    }
}