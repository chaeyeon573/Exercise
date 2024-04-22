package ProblemSet.supercoding;

public abstract class Shape {
    private String color;
    private int dimension;
    public Shape(int dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }


    public int getDimension(){
        return dimension;
    };
    public String getColor(){
        return color;
    };
    public void setColor(String color){
        this.color = color;


    }
    public abstract int getDimension();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
