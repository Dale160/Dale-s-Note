package Exer;

public class GeometricObject {
    protected String color;
    protected double weight;//权重

    public GeometricObject(String color,double weight){

    }

    public void setColor(String color){
        this.color = color;

    }

    public String getColor(){
        return color;

    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    //求面积的方法
    public double findArea(){
        return 0.0;
    }
}
