import java.awt.*;

public class Checker {
    private final Colors color;
    private int x;
    private int y;

    public Checker(Colors color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void moveUpRight() {
        ++this.x;
        ++this.y;
    }

    private void moveUpLeft() {
        --this.x;
        ++this.y;
    }

    private void moveDownRight() {
        ++this.x;
        --this.y;
    }

    private void moveDownLeft() {
        --this.x;
        --this.y;
    }

    public Colors getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
//25x17