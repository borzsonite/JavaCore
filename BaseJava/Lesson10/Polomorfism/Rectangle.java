package BaseJava.Lesson10.Polomorfism;

public class Rectangle extends Square {
    int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
