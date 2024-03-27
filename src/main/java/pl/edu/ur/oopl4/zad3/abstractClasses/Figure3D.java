package pl.edu.ur.oopl4.zad3.abstractClasses;

/**
 *
 */
public abstract class Figure3D extends Figure {

    protected double a;
    protected double b;
    protected double h;
    protected double r;

    public Figure3D(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Figure3D(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public Figure3D(double r) {
        this.r = r;
    }

    public abstract double volume();


}
