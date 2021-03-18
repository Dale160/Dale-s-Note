package CircleTest;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("c1的ID： " + c1.getId());
        System.out.println("c2的ID： " + c2.getId());
        System.out.println("c3的ID： " + c3.getId());

        System.out.println("创建的圆的个数为： " + Circle.getTotal() );



    }

}

class Circle{

    private double radius;
    private int id;

    public Circle(){
        id = init++; //共享ID编号，所以实现累加时的编号。
        total++; //共享个数，以实现个数的累加
    }

    public Circle(double radius){
        id = init++; //不能忘记其他的构造器也要有ID和total的累加
        total++;
        this.radius = radius;
    }

    private static int total; //记录造了多少个圆
    private  static int init = 1001; //编号 ,static声明的属性被所有对象共享

    public double findArea(){
        return Math.PI * radius *radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}