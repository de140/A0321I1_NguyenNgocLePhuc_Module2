package bai7_Abstract_class_and_interface.thuc_hanh.trien_khai_interface_comparator.circle_comparator;

import bai7_Abstract_class_and_interface.thuc_hanh.trien_khai_interface_comparator.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}