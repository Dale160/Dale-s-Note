package Test;

public class ConstrcutorTest {
    public static void main(String[] args) {

        //创建类的对象：new + 构造器
        Person p1 = new Person(); //这就是构造器

        Person p2 = new Person("Tom");//给对象进行初始化
        System.out.println(p1.name);


        p1.eat();
        p1.study();
    }


}

class Person{
    //属性
    String name;
    int age;

    //构造器
    public Person(){
        System.out.println("Person()....");
    }

    public Person(String n){
        name = n;
    }

    //和上面的构造器构成重载
    public Person(String n, int a ){
        name = n;
        age = a;
    }

    //方法
    public void eat(){
        System.out.println("人要吃饭");

    }

    public void study(){
        System.out.println("人要学习");
    }
}
