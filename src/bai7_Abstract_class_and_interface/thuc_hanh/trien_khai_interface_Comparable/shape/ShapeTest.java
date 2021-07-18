package bai7_Abstract_class_and_interface.thuc_hanh.trien_khai_interface_Comparable.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}