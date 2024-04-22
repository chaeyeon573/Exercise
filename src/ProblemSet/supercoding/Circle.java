package ProblemSet.supercoding;

public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        super(2,"기본색");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
    public double getRadius() {
        return radius;
    }


    public double calculateDiameter(){
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*2*radius;
    }



}
