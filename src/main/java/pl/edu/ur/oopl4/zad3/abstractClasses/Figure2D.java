package pl.edu.ur.oopl4.zad3.abstractClasses;

/**
 * Created by mchyl on 28/07/2018.
 */
public abstract class Figure2D  extends Figure{

    protected int a;
    protected int b;
    protected int r;

    public Figure2D(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Figure2D(int r) {
        this.r = r;
    }

    public abstract int area();

    public abstract int perimeter();

}
