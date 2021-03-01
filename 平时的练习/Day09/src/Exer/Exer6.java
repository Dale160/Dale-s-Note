package Exer;

public class Exer6 {
    public static void main(String[] args) {
        Circle c =  new Circle();
        PassObject test = new PassObject();

        test.printAreas(c,5);

        System.out.println("now radius is " + c.radius); //输出的是值传递以后的radius
    }

}

class Circle{
    double radius;

    public double findArea(){
        return Math.PI * radius * radius;
    }
}

class PassObject{


    public void printAreas(Circle c, int time){

        System.out.println("Radius\t\tArea"); //"\t"的意思就是Tab键，相当于4个空格

        //设置圆的半径
        for (int i = 1; i <= time; i++) {
            c.radius = i; //用c去调radius的方法，因为c是传进来的圆
            /*或者用
            * double area = c.findAreas();
            * sout (c.radius + "\t\t" + area);
            * */
            System.out.println(c.radius + "\t\t" + c.findArea() ); //因为上面有杠t杠t，为了对齐这边也有

        }
        //
        c.radius = time + 1;
    }
}
