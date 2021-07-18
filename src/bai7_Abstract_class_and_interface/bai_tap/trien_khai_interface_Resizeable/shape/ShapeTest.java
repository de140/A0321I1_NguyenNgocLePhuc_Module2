package bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.shape;
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}