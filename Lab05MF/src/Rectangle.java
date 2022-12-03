public class Rectangle
{
    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width * length;
    }

    public double getCircumference(){
        return 2* width +2*length;
    }

    public double getdiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
    }

}