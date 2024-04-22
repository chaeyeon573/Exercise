package ProblemSet.supercoding;

public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        super(2,"기본색");
        this.width = width;
        this.height = height;
    }

    double calculateDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    @Override
    double calculateArea(){
        return width*height;
    }
    @Override
    double calculatePerimeter(){
        return 2*(width+height);
    }



}
