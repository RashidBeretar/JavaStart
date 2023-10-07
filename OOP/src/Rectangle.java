public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int value) {
        this(value, value);
    }

    public Rectangle() {
        this(0);
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
