package Test;

public class Cylinder extends Circle{

    private double length;//高

    public Cylinder(){
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public  double findVolume(){
        return getRadius() * getRadius() * Math.PI *getLength();
//        return findArea() * getLength(); //等同于上面 （未改变父类方式的话）

    }
    @Override
    public double findArea(){ //求圆柱表面积
        return getRadius() * getRadius() * Math.PI + 2 * Math.PI * getLength() * getLength();

    }

}
