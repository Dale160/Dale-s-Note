package CodeBlockTest;

public class BlockTest {
    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println(desc);

        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.toString());


    }


}

class Person {
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态代码块：
    static{
        System.out.println("hello static Block-1");
        desc = "我是一个爱学习的人";
        info();
//        eat(); //不可以 是非静态方法


    }

    static{
        System.out.println("hello static block-2");

    }
    //非静态代码块
    {
        System.out.println("hello non-static Block1");
        age = 1;
        eat(); //可以调用 非静态方法
        info(); //也可以调用 静态方法
    }
    {
        System.out.println("hello non-static Block2");
        age = 2;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info (){
        System.out.println("我是一个快乐的人！");
    }
}