package Test;

public class Circle {

    private double radius;

    public Circle(){
        radius =1.0;
    }
    public void setRadius(double radius){
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    //返回圆的面积
    public double findArea(){
        return radius * radius * Math.PI;
    }
}
