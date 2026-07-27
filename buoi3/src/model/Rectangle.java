package model;
public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double length, double width) {

        this.length = (length > 0) ? length: -1;
        this.width = (width > 0 ) ? width: -1 ;
    }
    public double getParameter(){
        return 2.0*(width+length);
}

    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width*length;
}

}
