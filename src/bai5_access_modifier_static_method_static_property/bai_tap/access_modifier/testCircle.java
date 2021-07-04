package bai5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        double radius = circle.getRadius();
        double area = circle.getArea();

        System.out.println(radius);
        System.out.println(area);
    }
}
