package Exer;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, double weight,double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }

    
}
