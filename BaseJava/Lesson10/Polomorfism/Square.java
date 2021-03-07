package BaseJava.Lesson10.Polomorfism;

public class Square {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return this.width * this.width;
    }
}

