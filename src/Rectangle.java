public class Rectangle {
    double width, height;
    public Rectangle(){}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return (width + height) * 2;
    }
    void display(){
        System.out.println("Area = " +width + "x" + height + " = " + getArea());
        System.out.println("Perimeter = (" + width + "+" + height + ")" + " = " + getPerimeter());
    }


}

