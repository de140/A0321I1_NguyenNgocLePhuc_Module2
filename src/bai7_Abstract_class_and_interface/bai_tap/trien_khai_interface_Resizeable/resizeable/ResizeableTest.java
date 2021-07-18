package bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.resizeable;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.circle.Circle;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.rectangle.Rectangle;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.shape.Shape;
import bai7_Abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable.square.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]= new Circle(3.5);
        shapes[1]=new Rectangle(4,5);
        shapes[2]=new Square(4);

        double resizePercent = Math.random() * 100;
        System.out.println("Resize percent: " + resizePercent + "% \n----------");
        for (Shape shape: shapes) {
            if (shape instanceof Circle){
                System.out.println("Diện tích hình tròn trước khi resize: "+((Circle) shape).getArea());
                ((Circle) shape).resize(resizePercent);
                System.out.println("Diện tích hình tròn sau khi resize: "+((Circle) shape).getArea()+ "\n----------");
            }
            if(shape instanceof Square){
                System.out.println("Diện tích hình vuông trước khi resize: "+((Square) shape).getArea());
                ((Square) shape).resize(resizePercent);
                System.out.println("Diện tích hình vuông sau khi resize: "+((Square) shape).getArea()+"\n----------");
            }else if(shape instanceof Rectangle){
                System.out.println("Diện tích hình chữ nhật trước khi resize: "+((Rectangle) shape).getArea());
                ((Rectangle) shape).resize(resizePercent);
                System.out.println("Diện tích hình chữ nhật sau khi resize: "+((Rectangle) shape).getArea()+"\n----------");
            }
        }}
}