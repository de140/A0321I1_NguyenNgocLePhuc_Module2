package bai4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

public class rectangle {
    double height;
    double width;

    public rectangle() {
    }

    public rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return (this.height * this.width);
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "height = " + height + ", width = " + width + '}';
    }
}