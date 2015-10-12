/**
 * Created by Lex on 12.10.2015.
 */
public abstract class AbstractItem {

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract void move();

    public abstract void draw();

    public abstract void destroy();
}
