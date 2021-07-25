package bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_colorable.colorable;

import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_colorable.circle.Circle;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_colorable.rectangle.Rectangle;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_colorable.shape.Shape;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_colorable.square.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 9);
        shapes[2] = new Square(7);

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}