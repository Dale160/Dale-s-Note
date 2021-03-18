package StaticTest;

public class StaticTest {
    public static void main(String[] args) {

        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 35;
        c2.nation = "CHINA";
        System.out.println(c1.nation);

//        错误用法，编译不通过，无法通过类调用实例变量
//        Chinese.name = "张继科";
        c1.eat();  //通过 对象 调用
        Chinese.show(); //通过 类 调用



    }
}

class Chinese{

    String name;
    int age;
    static String nation;

    public void eat (){
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.info();
        //调用静态结构
        walk();

    }
    static public void show(){
        System.out.println("我是一个中国人");
        //不能调用非静态体的结构
//        eat();

        //可以调用静态的体的结构
        walk();
    }

    public static void walk(){

    }
    public void info(){

    }

}
