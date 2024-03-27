package pl.edu.ur.oopl4.zad3.abstractClasses;

/**
 *
 */
public abstract class Figure2D extends Figure {

    protected double a;
    protected double b;
    protected double r;

    public Figure2D(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure2D(double r) {
        this.r = r;
    }

    public abstract double area();

    public abstract double perimeter();

}
