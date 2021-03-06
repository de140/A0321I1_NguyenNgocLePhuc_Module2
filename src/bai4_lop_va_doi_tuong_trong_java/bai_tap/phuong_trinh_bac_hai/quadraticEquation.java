package bai4_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;

public class quadraticEquation {
    private double a;
    private double b;
    private double c;

    public quadraticEquation() {
    }

    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * 2) - (4 * (this.a - this.c));
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(Math.pow(this.b, 2)) - (4 * (this.a - this.c)))) / (2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(Math.pow(this.b, 2)) - (4 * (this.a - this.c)))) / (2 * this.a);
    }

    public double getDoubleRoot() {
        return ((-this.b) / (2 * this.a));
    }

    @Override
    public String toString() {
        return "Quadratic Equation {" + "a = " + a + ", b = " + b + ", c = " + c + '}';
    }
}