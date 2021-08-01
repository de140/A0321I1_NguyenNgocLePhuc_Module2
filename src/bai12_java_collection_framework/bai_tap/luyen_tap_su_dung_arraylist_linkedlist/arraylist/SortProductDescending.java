package bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.arraylist;

import java.util.Comparator;

public class SortProductDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return ((o1.getPrice() < o2.getPrice() ) ? 1 : -1);
    }
}