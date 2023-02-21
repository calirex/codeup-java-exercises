package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // GETTERS AND SETTERS //


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract public void setLength(int length);
    abstract public void setWidth(int width);
}
